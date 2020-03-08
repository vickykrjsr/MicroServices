package com.learn.microservice.currencyexchangeserive;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CurrencyValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	public ExchangeValue findByFromAndTo(String from, String to);

}
