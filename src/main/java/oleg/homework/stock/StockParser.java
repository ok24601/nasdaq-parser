package oleg.homework.stock;


import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;

@Component
public class StockParser {

    public static final String URL = "http://www.nasdaq.com/symbol/";

    private static final String PRICE_SELECTOR = "#qwidget_lastsale";
    private static final String NAME_SELECTOR = "div span b";

    public static final int TIMEOUT_MILLIS = 15000;

    public String parse(String company, String selector) throws IOException {
        return Jsoup.parse(new URL(URL + company), TIMEOUT_MILLIS)
                .select(selector)
                .first()
                .ownText();
    }


    public String parsePrice(String company) throws IOException {
        return parse(company, PRICE_SELECTOR);
    }

    public String parseName(String company) throws IOException {
        return parse(company, NAME_SELECTOR);
    }
}
