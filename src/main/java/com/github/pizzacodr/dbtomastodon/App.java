package com.github.pizzacodr.dbtomastodon;

import java.io.IOException;
import java.sql.SQLException;
import org.aeonbits.owner.ConfigFactory;
import com.github.pizzacodr.dbtomastodon.model.MastodonItem;

public class App {

	public static void main(String[] args) throws IOException, SQLException {
		
		ConfigFile configFile = ConfigFactory.create(ConfigFile.class, System.getProperties());
		
		Database database = new Database(configFile.dbFileLocation(), configFile.tableName());
		MastodonItem mastodonItem = database.selectNewFromDBIfNotPosted();
		
		if (mastodonItem != null) {
			MastodonEndpointConnector mastodonEndpointConnector = new MastodonEndpointConnector(configFile.baseUrl());
			mastodonEndpointConnector.postNewStatus(mastodonItem.getContent(), mastodonItem.getShareLink(), 
					configFile.bearerToken(), configFile.uri());
			database.updateTable(mastodonItem.getId());
		}
	}
}
