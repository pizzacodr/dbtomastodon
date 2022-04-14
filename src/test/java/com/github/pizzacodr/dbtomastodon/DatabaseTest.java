package com.github.pizzacodr.dbtomastodon;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import com.github.pizzacodr.dbtomastodon.model.MastodonItem;


class DatabaseTest {
	
	@TempDir
	Path tempDir;

	@Test
	void testDatabase() {
		assertThrows(SQLException.class,
                ()->{
                new Database("wrongPath");
                });
	}

	@Test
	void testSelectNewFromDBIfNotPosted() throws IOException, SQLException {
		ClassLoader classLoader = this.getClass().getClassLoader();
        File sourceFile = new File(classLoader.getResource("mastodonTest.sqlite").getFile());
        
        File destFile = new File(tempDir.toString() + "/mastodonTest.sqlite");
        Files.copy(sourceFile.toPath(), destFile.toPath());
        
        String connectionString = "jdbc:sqlite:" + destFile.getAbsolutePath();
        Database database = new Database(connectionString);
        
        MastodonItem mastodonItemFromDB = database.selectNewFromDBIfNotPosted();
        
        MastodonItem mastodonCompare = new MastodonItem();
        
        mastodonCompare.setId(4);
        mastodonCompare.setContent("Dwelleth in Us\n"
        		+ "Wednesday night sermon by pastor Tony Kohout in 2021.\n"
        		+ "");
        mastodonCompare.setShareLink("https://www.podbean.com/ew/pb-9rc5w-1120347");
        
        assertTrue(mastodonItemFromDB.getId() == mastodonCompare.getId());
        assertTrue(mastodonItemFromDB.getContent().equals(mastodonCompare.getContent()));
        assertTrue(mastodonItemFromDB.getShareLink().equals(mastodonCompare.getShareLink()));
	}

	@Test
	void testUpdateMastodon() throws IOException, SQLException {
		ClassLoader classLoader = this.getClass().getClassLoader();
        File sourceFile = new File(classLoader.getResource("mastodonTest.sqlite").getFile());
        
        File destFile = new File(tempDir.toString() + "/mastodonTest.sqlite");
        Files.copy(sourceFile.toPath(), destFile.toPath());
        
        String connectionString = "jdbc:sqlite:" + destFile.getAbsolutePath();
        Database database = new Database(connectionString);
        
        database.updateMastodon(4);
        
        Connection connection = DriverManager.getConnection(connectionString);
    	Statement statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery("SELECT POSTED FROM MASTODON WHERE ID = 4;");
    	
    	int postedFromDB = 0;
    	while (rs.next()) {
    		postedFromDB = rs.getInt("POSTED");
	    }
    	
    	assertTrue(postedFromDB == 1);
	}
}
