package com.github.pizzacodr.dbtomastodon;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "file:${user.dir}/dbtomastodon.properties", 
"file:${user.home}/dbtomastodon.properties"})

interface ConfigFile extends Config {
	
	String bearerToken();
	String dbFileLocation();
	String baseUrl();
	String uri();
	String tableName();
	String whichService();
	String consumerKey();
	String consumerSecret();
	String accessToken();
	String accessTokenSecret();
	String tumblrJournalName();
	String tumblrLinkTitle();
}
