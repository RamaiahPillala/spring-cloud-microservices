package com.ramaiah.cloud.exachange.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal ConversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCaluculatedAmount;
	private int port;
	
	public CurrencyConversionBean() {
		
	}

	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCaluculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		ConversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCaluculatedAmount = totalCaluculatedAmount;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return ConversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		ConversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCaluculatedAmount() {
		return totalCaluculatedAmount;
	}

	public void setTotalCaluculatedAmount(BigDecimal totalCaluculatedAmount) {
		this.totalCaluculatedAmount = totalCaluculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
