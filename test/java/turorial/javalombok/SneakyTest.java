package turorial.javalombok;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SneakyTest {
    Logger log = LoggerFactory.getLogger(SneakyTest.class);
    @Test
    void testFileHelperSneakyThrows() {//dengan begini kita tidak perlu throws errornya lagi karena di method class nya di sudah tidak throw error lagi
        String file = FileHelper.loadFileXml("pom.xml");
        log.info("{}", file);
    }
}
