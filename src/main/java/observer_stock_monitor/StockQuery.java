package observer_stock_monitor;

public class StockQuery {
    private String stockCode;
    private double price;

    public StockQuery(String stockCode, double price) {
        this.stockCode = stockCode;
        this.price = price;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
