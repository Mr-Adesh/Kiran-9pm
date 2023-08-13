package com.example.demo.config;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

import feign.Feign;

@LoadBalancerClient("SBISERVICE")
public class ClientLoadBalancer {

	public Feign.Builder builder()
	{
		return Feign.builder();
	}
}
