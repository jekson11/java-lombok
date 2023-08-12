package turorial.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonNullTest {
    @Test
    void tesMemberNonNUll(){
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member(null);
        });

        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member("jekson");
            member.setName(null);
        });
    }

    @Test
    void testMemberNonNullSayHello(){
        Assertions.assertThrows(NullPointerException.class, () -> {
           Member member = new Member("jekson");
           member.sayHello(null);
        });
    }
}
