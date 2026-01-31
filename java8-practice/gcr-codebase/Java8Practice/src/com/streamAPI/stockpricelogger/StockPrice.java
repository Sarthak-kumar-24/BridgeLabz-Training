package com.streamAPI.stockpricelogger;

/*
 * StockPrice
 * ----------
 * Represents a stock with
 * name and current price.
 */
public class StockPrice {

	private String stockName;
	private double price;

	public StockPrice(String stockName, double price) {
		this.stockName = stockName;
		this.price = price;
	}

	public String getStockName() {
		return stockName;
	}

	public double getPrice() {
		return price;
	}
}
