package com.github.pizzacodr.dbtomastodon;

import java.util.UUID;

import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pizzacodr.dbtomastodon.model.StatusResponse;

import ch.qos.logback.classic.Logger;

class MastodonEndpointConnector {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(MastodonEndpointConnector.class);
	private WebClient webClient;
	
	MastodonEndpointConnector(String baseUrl) {
		webClient = WebClient.create(baseUrl);
	}
	
	public StatusResponse postNewStatus(String content, String shareLink, String bearerToken, String uri) throws JsonProcessingException {

		UUID uuid = UUID.randomUUID();
		
		String responseJson = "";
		
		try {
			responseJson = webClient.post()
					.uri(uri)
					.header("Idempotency-Key", uuid.toString())
					.header("Authorization", "Bearer " + bearerToken)
					.body(BodyInserters.fromFormData("status", content +"\n" + shareLink))
					.retrieve()
					.bodyToMono(String.class)
					.log()
					.block();
			
		} catch (WebClientResponseException e) { 

	         logger.error(e.getResponseBodyAsString());
	         throw e;
		}
		
		JsonFactory jsonFactory = new JsonFactory();
		ObjectMapper objectMapper = new ObjectMapper(jsonFactory);
		
		return objectMapper.readValue(responseJson, StatusResponse.class);
	}
}
