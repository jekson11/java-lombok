package turorial.javalombok;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToStringTest {
    Logger log = LoggerFactory.getLogger(ToStringTest.class);
    @Test
    void testLoginToString(){
        //ini yang annotation toString biasa
        Login login = new Login();
        login.setUsername("Jekson");
        login.setPassword("rahasia");

        log.info("{}", login);
    }

    @Test
    void testLoginToStringExclude(){
        //ini yang annotation toString yang menggunakan parameter exclude
        Login login = new Login();
        login.setUsername("Jekson");
        login.setPassword("rahasia");

        log.info("{}", login);
    }
}
