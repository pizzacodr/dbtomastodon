package com.github.pizzacodr.dbtomastodon;

import java.sql.SQLException;
import org.aeonbits.owner.ConfigFactory;
import com.github.pizzacodr.dbtomastodon.model.MastodonItem;
import twitter4j.TwitterException;

public class App {

	public static void main(String[] args) throws SQLException, TwitterException, IllegalAccessException, InstantiationException {
		
		ConfigFile configFile = ConfigFactory.create(ConfigFile.class, System.getProperties());
		
		Database database = new Database(configFile.dbFileLocation(), configFile.tableName());
		MastodonItem mastodonItem = database.selectNewFromDBIfNotPosted();
		
		if (mastodonItem != null) {
			MastodonEndpointConnector mastodonEndpointConnector = new MastodonEndpointConnector(configFile);
			mastodonEndpointConnector.postNewStatus(mastodonItem.getContent(), mastodonItem.getShareLink());
			database.updateTable(mastodonItem.getId());
		}
	}
}
