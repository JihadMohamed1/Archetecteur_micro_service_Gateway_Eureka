package com.example.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

	@Bean
	RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/clients/**").uri("http://localhost:8081"))
				.route(r -> r.path("/produits/**").uri("http://localhost:8082"))
				.build();
	}


	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

}
