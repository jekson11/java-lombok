package turorial.javalombok;

import org.junit.jupiter.api.Test;
import java.io.IOException;

public class CleanUpTest {
    @Test
    void testFileHelperCleanUp() throws IOException {
        String file = FileHelper.loadFileXml("pom.xml");
        System.out.println(file);
    }
}
