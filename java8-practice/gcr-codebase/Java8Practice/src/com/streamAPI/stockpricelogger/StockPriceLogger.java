package com.streamAPI.stockpricelogger;

import java.util.*;

/*
 * StockPriceLogger
 * ----------------
 * Logs stock prices using
 * forEach() method.
 */
public class StockPriceLogger {

	public static void main(String[] args) {

		List<StockPrice> livePrices = Arrays.asList(new StockPrice("TCS", 3890.50), new StockPrice("INFY", 1562.30),
				new StockPrice("RELIANCE", 2934.80), new StockPrice("HDFC", 1678.25));

		System.out.println(" Live Stock Price Updates:");

		// Using forEach with lambda expression
		livePrices.forEach(stock -> System.out.println(stock.getStockName() + " -> Rs" + stock.getPrice()));
	}
}
