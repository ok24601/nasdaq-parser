import oleg.homework.security.SecurityParser;
import org.junit.Test;
import java.io.IOException;

public class SecurityParserTest {

    @Test
    public void parseTest() throws IOException {
        SecurityParser parser = new SecurityParser();
        System.out.println(parser.parsePrice("msft"));
        System.out.println(parser.parseName("msft"));
    }
}
