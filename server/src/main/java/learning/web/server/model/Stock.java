package learning.web.server.model;

public class Stock {
    private int id;
    private String ticker;
    private String name;
    private Market exchangeMarket;
    private long sharesIssued;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
