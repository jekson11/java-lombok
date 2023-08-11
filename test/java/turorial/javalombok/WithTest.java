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
        //biasanya kan jika kita ingin membuat object yang berbeda kita membuat nya seperti ini
        //padahal kita hanya ingin username nya saja yang berbeda atau passwornya saja yang berbeda
        //dengan kita menggunakan With maka tidak perllu seperti ini
        Register register = new Register("jekson", "tambunan");
        log.info("{}", register);

        Register register2 = new Register("jekson", "jekson1103");
        log.info("{}", register2);

        Assertions.assertEquals(register.getUsername(), register2.getUsername());
        Assertions.assertNotEquals(register.getPassword(), register2.getPassword());
    }

    @Test
    void tesRegisterWithBook(){
        //lihat penjelasan tentang With nya di class Register
        //ini jika kita menggunaka With annotation
        Register register = new Register("Jekson", "Tambunan");
        log.info("{}", register);

        //ini usernamenya sama tapi passwornya beda
        Register register1 = register.withPassword("Rahasia");
        log.info("{}", register1);

        //ini usernamenya beda tapi passwornya sama
        Register register2 = register.withUsername("jekson11");
        log.info("{}", register2);

        Assertions.assertEquals(register.getUsername(), register1.getUsername());
        Assertions.assertNotEquals(register.getPassword(), register1.getPassword());

        Assertions.assertNotEquals(register.getUsername(), register2.getUsername());
        Assertions.assertEquals(register.getPassword(), register2.getPassword());
    }
}
