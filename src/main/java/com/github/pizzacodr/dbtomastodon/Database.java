package com.github.pizzacodr.dbtomastodon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.slf4j.LoggerFactory;
import com.github.pizzacodr.dbtomastodon.model.MastodonItem;
import ch.qos.logback.classic.Logger;

class Database {
	private static Logger logger = (Logger) LoggerFactory.getLogger(Database.class);
	private Connection connection;
	private Statement statement;
	private String tableName;
	
	public Database(String dbFileLocation, String tableName) throws SQLException {
		connection = DriverManager.getConnection(dbFileLocation);
		statement = connection.createStatement();
		this.tableName = tableName;
	}
	
	public MastodonItem selectNewFromDBIfNotPosted() throws SQLException {
		
		ResultSet rs = statement.executeQuery("SELECT ID, CONTENT, SHARELINK FROM " + tableName + " WHERE POSTED = 0;");
		
		if (rs.next()) {
			
			MastodonItem mastodonItem = new MastodonItem();
			
			int id = rs.getInt(1);
			logger.debug("ID: {}", id);
			mastodonItem.setId(id);
			
			String content = rs.getString(2);
			logger.debug("Content: {}", content);
			mastodonItem.setContent(content);
			
			String shareLink = rs.getString(3);
			logger.debug("ShareLink: {}", shareLink);
			mastodonItem.setShareLink(shareLink);
			
			return mastodonItem;
        } else {
        	
        	logger.debug("nothing was selected from table");
        	return null;
        }
	}
	
	public void updateTable (int id) throws SQLException {
		
		statement.executeUpdate("UPDATE " + tableName + " SET POSTED = 1 WHERE ID = " + id + ";");
	}
}
