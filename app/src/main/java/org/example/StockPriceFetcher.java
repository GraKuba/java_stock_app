package org.example;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class StockPriceFetcher {
    public void fetchAndPrintStockPrice() {
        try {
            Stock stock = YahooFinance.get("^DJI"); // Symbol for Dow Jones Industrial Average
            if (stock != null) {
                double price = stock.getQuote().getPrice().doubleValue();
                System.out.println("Current DJIA Price: " + price);
            } else {
                System.out.println("Failed to fetch DJIA price.");
            }
        } catch (Exception e) {
            System.out.println("Error fetching stock price: " + e.getMessage());
            e.printStackTrace();
        }
    }
}