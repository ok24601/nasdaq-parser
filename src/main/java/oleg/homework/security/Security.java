package oleg.homework.security;


public class Security {

    private String ticker;
    private String price;


    @Override
    public String toString() {
        return String.format("%s : %s", ticker, price);
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
