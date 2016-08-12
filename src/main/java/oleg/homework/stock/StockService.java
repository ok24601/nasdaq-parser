package oleg.homework.stock;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.io.IOException;
import java.util.Optional;

@Service
public class StockService {

    private StockParser parser;

    public Optional<Stock> getStock(String comp) throws IOException {
        Stock security = new Stock();
        security.setPrice(parser.parsePrice(comp));
        security.setTicker(parser.parseName(comp));
        return Optional.ofNullable(security);
    }

    @Inject
    public void setParser(StockParser parser) {
        this.parser = parser;
    }

}
