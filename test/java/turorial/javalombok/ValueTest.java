package turorial.javalombok;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValueTest {
    Logger log = LoggerFactory.getLogger(ValueTest.class);
    @Test
    void testRegisterValueAnnotation(){
        Register register = new Register("jekson", "rahasia");
        //penjelasan di class Register
        log.info("{}", register.getUsername());
        log.info("{}", register.getPassword());
    }
}
