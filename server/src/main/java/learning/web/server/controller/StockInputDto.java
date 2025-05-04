package learning.web.server.controller;

import learning.web.server.model.Market;
import learning.web.server.model.Stock;

public class StockInputDto {
    private String ticker;
    private String name;
    private Market exchangeMarket;
    private long sharesIssued;

    public Stock toStock(){
        Stock stock = new Stock();
        stock.setTicker (ticker);
        stock.setName (name);
        stock.setExchangeMarket (exchangeMarket);
        stock.setSharesIssued (sharesIssued);

        return stock;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Market getExchangeMarket() {
        return exchangeMarket;
    }

    public void setExchangeMarket(Market exchangeMarket) {
        this.exchangeMarket = exchangeMarket;
    }

    public long getSharesIssued() {
        return sharesIssued;
    }

    public void setSharesIssued(long sharesIssued) {
        this.sharesIssued = sharesIssued;
    }
}
