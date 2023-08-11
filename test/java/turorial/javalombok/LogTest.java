package turorial.javalombok;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.flogger.Flogger;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

//dengan kita menambahkan annotation Slf4j kita bisa menggunakan library nya dan tidak susah lagi harus membuat log secara manual
//dia ini mendukung banya sekali library intul logging y
@Slf4j
//ini contoh library logging yang lain
//@CommonsLog
//@Flogger
//@Log4j
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
