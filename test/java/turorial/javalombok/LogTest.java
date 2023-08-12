package turorial.javalombok;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.flogger.Flogger;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LogTest {
    @Test
    void testLog(){
        log.warn("log warm");
        log.debug("log debug");
        log.info("log info");
        log.trace("log trace");
        log.error("log error");
    }
}
