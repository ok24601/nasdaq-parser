package oleg.homework.stock;
import javax.validation.constraints.NotNull;

public class Stock {

    @NotNull
    private String ticker;
    @NotNull
    private String price;

    public Stock() { }

    public String getTicker() {
        return ticker;
    }

    public String getPrice() {
        return price;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s : %s", ticker, price);
    }
}
