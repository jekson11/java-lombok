package turorial.javalombok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConstructorTest {
    @Test
    void testLogin(){
        Login login = new Login("jekson", "rahasia");

        assertEquals("jekson", login.getUsername());
        assertEquals("rahasia", login.getPassword());
    }

    @Test
    void testPersonStaticMethod(){
        Person person = Person.sayHello();
        assertNull(person.getMessage());

        Person person1 = Person.sayHai("jekson", "Hai..");
        assertNotNull(person1);
        assertEquals("jekson", person1.getName());
        assertEquals("Hai..", person1.getMessage());
    }

    @Test
    void testAnimalsRequiredConstructor(){
        Animals animals = new Animals("Cat", "Miaww");

        assertEquals("Cat", animals.getName());
        assertEquals("Miaww", animals.getSound());
        assertNull(animals.getRun());
    }
}
