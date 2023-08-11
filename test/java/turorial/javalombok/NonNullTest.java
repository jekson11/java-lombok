package turorial.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonNullTest {
    @Test
    void tesMemberNonNUll(){
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member(null);//akan error karena kita set null
        });

        //maupun menggunakan seter
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member("jekson");
            member.setName(null);//akan error karena kita set null
        });
    }

    @Test
    void testMemberNonNullSayHello(){
        Assertions.assertThrows(NullPointerException.class, () -> {
           Member member = new Member("jekson");
           member.sayHello(null);//maka akan error karna kita set null parameternya
        });
    }
}
