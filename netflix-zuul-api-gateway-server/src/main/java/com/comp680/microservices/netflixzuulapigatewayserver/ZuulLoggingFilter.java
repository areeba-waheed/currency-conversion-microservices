package com.comp680.microservices.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean shouldFilter() { //should this filter be executed or not
		return true; //filter execute for every request
	}

	@Override
	public Object run() throws ZuulException { //logic of interception
		//details of the request
		HttpServletRequest request =RequestContext.getCurrentContext().getRequest();
		logger.info("request -> {} request uri -> {}", request, request.getRequestURI());
		//http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/ENR
		return null;
	}

	@Override
	public String filterType() { //when should the filter happen, before or after the execution or if filter only error requests
		return "pre";
	}

	@Override
	public int filterOrder() { //multiple filters, set a priority order
		return 1; 
	}

}
