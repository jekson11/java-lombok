package turorial.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.aot.BeanRegistrationCodeFragmentsDecorator;

public class WithTest {
    Logger log = LoggerFactory.getLogger(WithTest.class);
    @Test
    void testRegisterWithOutWithBook(){
    
        Register register = new Register("jekson", "tambunan");
        log.info("{}", register);

        Register register2 = new Register("jekson", "jekson1103");
        log.info("{}", register2);

        Assertions.assertEquals(register.getUsername(), register2.getUsername());
        Assertions.assertNotEquals(register.getPassword(), register2.getPassword());
    }

    @Test
    void tesRegisterWithBook(){
    
        Register register = new Register("Jekson", "Tambunan");
        log.info("{}", register);

        Register register1 = register.withPassword("Rahasia");
        log.info("{}", register1);

        Register register2 = register.withUsername("jekson11");
        log.info("{}", register2);

        Assertions.assertEquals(register.getUsername(), register1.getUsername());
        Assertions.assertNotEquals(register.getPassword(), register1.getPassword());

        Assertions.assertNotEquals(register.getUsername(), register2.getUsername());
        Assertions.assertEquals(register.getPassword(), register2.getPassword());
    }
}
