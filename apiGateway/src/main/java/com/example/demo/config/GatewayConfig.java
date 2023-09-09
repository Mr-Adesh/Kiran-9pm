package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
	@Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder)
    {
		System.out.println("Swcurity logic applied");
    	return builder.routes()
    			.route("1234", r-> r.path("/pay").uri("http://localhost:5555/pay"))
    			.route("1111", r-> r.path("/b").uri("http://localhost:1111/b"))
    			.build();
    }
}

