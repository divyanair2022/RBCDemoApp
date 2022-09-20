package com.rbc.stock.model;

import org.springframework.data.annotation.Id;


public class Stock {

	@Id
	private String id;

	private String name;
	private String ticker;

	public Stock() {}

	public Stock(String name, String ticker) {
		this.name = name;
		this.ticker = ticker;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ticker
	 */
	public String getTicker() {
		return ticker;
	}

	/**
	 * @param ticker the ticker to set
	 */
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	@Override
	public String toString() {
		return String.format(
				"Stock[id=%s, name='%s', ticker='%s']",
				id, name, ticker);
	}

}

