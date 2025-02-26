package com.services.config;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class RoutingConfig {

	@Bean
	public RouterFunction<ServerResponse> microservice1() {
		return GatewayRouterFunctions.route("Microservices01")
				.route(RequestPredicates.path("/info"), HandlerFunctions.http("http://localhost:8081")).build();
	}
	
	@Bean
	public RouterFunction<ServerResponse> microservice2() {
		return GatewayRouterFunctions.route("Microservices02")
				.route(RequestPredicates.path("/info"), HandlerFunctions.http("http://localhost:8082")).build();
	}
}
