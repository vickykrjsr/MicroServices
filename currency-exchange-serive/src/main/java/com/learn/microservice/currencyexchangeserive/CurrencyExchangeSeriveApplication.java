package com.learn.microservice.currencyexchangeserive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeSeriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeSeriveApplication.class, args);
	}

}
