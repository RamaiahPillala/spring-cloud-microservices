package com.ramaiah.cloud.exachange.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ramaiah.cloud.exachange.bean.ExchangeValue;
import com.ramaiah.cloud.exachange.repo.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Environment environment;
	@Autowired
	private ExchangeValueRepository exchangeRepo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from,@PathVariable String to) {
		
	//	ExchangeValue exchangeValue =new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
		ExchangeValue exchangeValue = exchangeRepo.findByFromAndTo( from, to);
		
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		logger.info("{}",exchangeValue);
		return exchangeValue;
		
	}

}
