package oleg.homework.security;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.io.IOException;

@Service
public class SecurityService {

    private SecurityParser parser;

    public Security getSecurity(String comp) throws IOException {
        Security security = new Security();
        security.setPrice(parser.parsePrice(comp));
        security.setTicker(parser.parseName(comp));
        return security;
    }

    @Inject
    public void setParser(SecurityParser parser) {
        this.parser = parser;
    }

}
