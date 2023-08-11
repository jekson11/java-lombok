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
        //otomatis ini tidak bisa karema harapan kita untuk membuat object class person
        //harus menggunakan static method yang ada di class person ini costructornya akan menjadi private
//        Person person = new Person();

        //lihat class Person y
        Person person = Person.sayHello();//ini yang tanpa parameter
        assertNull(person.getName());
        assertNull(person.getMessage());

        //pembuatan object class person menggunakan static method class nya
        Person person1 = Person.sayHai("jekson", "Hai..");
        assertNotNull(person1);
        assertEquals("jekson", person1.getName());
        assertEquals("Hai..", person1.getMessage());
    }

    @Test
    void testAnimalsRequiredConstructor(){
        //maka constructornya hanya akan di buat memiliki parameter yang kita mau
        //tapi ingat kita harus membuat field nya sebagai final untuk menandakan bahwa field tersebut
        //yang boleh di jadikan parameter pada constructor
        Animals animals = new Animals("Cat", "Miaww");

        assertEquals("Cat", animals.getName());
        assertEquals("Miaww", animals.getSound());
        assertNull(animals.getRun());
    }
}
