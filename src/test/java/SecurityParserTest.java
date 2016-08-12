
import oleg.homework.stock.StockParser;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;


public class SecurityParserTest {


    @Test
    public void parseTest() throws IOException {
        StockParser parser = new StockParser();
        Assert.assertEquals("MSFT", parser.parseName("msft"));
    }

}
