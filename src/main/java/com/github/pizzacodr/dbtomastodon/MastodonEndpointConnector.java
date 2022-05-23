package com.github.pizzacodr.dbtomastodon;

import java.util.UUID;

import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import ch.qos.logback.classic.Logger;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

class MastodonEndpointConnector {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(MastodonEndpointConnector.class);
	private ConfigFile configFile;
	
	MastodonEndpointConnector(ConfigFile configFile) {
		this.configFile = configFile;
	}
	
	public void postNewStatus(String content, String shareLink) throws TwitterException {
		
		WebClient webClient = WebClient.create(configFile.baseUrl());
		
		try {
			if (configFile.whichService().equalsIgnoreCase("Mastodon")) {
				
				UUID uuid = UUID.randomUUID();
				
				webClient.post()
						.uri(configFile.uri())
						.header("Idempotency-Key", uuid.toString())
						.header("Authorization", "Bearer " + configFile.bearerToken())
						.body(BodyInserters.fromFormData("status", content +"\n" + shareLink))
						.retrieve()
						.bodyToMono(String.class)
						.log()
						.block();
			} else if (configFile.whichService().equalsIgnoreCase("Twitter")) {
				
				ConfigurationBuilder cb = new ConfigurationBuilder();
			    cb.setDebugEnabled(true)
			            .setOAuthConsumerKey(configFile.twitterAPIKey())
			            .setOAuthConsumerSecret(configFile.twitterAPIKeySecret())
			            .setOAuthAccessToken(configFile.twitterAccessToken())
			            .setOAuthAccessTokenSecret(configFile.twitterAccessTokenSecret()); 
			    TwitterFactory tf = new TwitterFactory(cb.build());
			    Twitter twitter = tf.getInstance();
			    twitter.updateStatus(content +"\n" + shareLink);
			}
			
		} catch (WebClientResponseException e) { 

	         logger.error(e.getResponseBodyAsString());
	         throw e;
		} catch (TwitterException e) {
			
	    	logger.error(e.getErrorMessage());
	    	throw e;
	    } 
	}
}
