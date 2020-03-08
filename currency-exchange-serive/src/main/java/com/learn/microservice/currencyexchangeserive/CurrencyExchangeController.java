package com.learn.microservice.currencyexchangeserive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyValueRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from,
			@PathVariable String to)
	{
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		
		//setting the port  
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port"))); 
		
		
		
		
		
		return exchangeValue;
		
	}
	

}
