package com.comp680.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_From")
	private String from;
	
	@Column(name="currency_To")
	private String to;
	
	@Column(name="conversion_multiple")
	private BigDecimal conversionMultiple;
	
	private int port;
	
	
	public ExchangeValue() {}
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public Long getId() {
		return id;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setConversionMultiple(BigDecimal coversionMultiple) {
		this.conversionMultiple = coversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
