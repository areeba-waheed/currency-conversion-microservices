package com.comp680.microservces.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="netflix-zuul-api-gateway-server") 
@RibbonClient(name="currency-exchange-service") 
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue
	(@PathVariable("from") String from, @PathVariable("to") String to);
}

/***
//@FeignClient(name="currency-exchange-service", url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server") 
@RibbonClient(name="currency-exchange-service") //this made multiple exchange serice ports get distributed work of conversion servicve
public interface CurrencyExchangeServiceProxy {
	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue
	(@PathVariable("from") String from, @PathVariable("to") String to);
}


//http://localhost:8000/currency-exchange/from/USD/to/ENR
//http://localhost:8100/currency-converter-feign/from/USD/to/ENR/quantity/100
//http://localhost:8001/currency-exchange/from/USD/to/ENR

*///