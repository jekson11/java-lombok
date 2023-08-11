package turorial.javalombok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EqualsAndHashCodeTest {
    @Test
    void testCustomerEqualsAndHashCode(){
        Customer customer1 = new Customer("jk", "jekson");
        Customer customer2 = new Customer("jk", "jekson");
        Customer customer3 = new Customer("jk", "tambunan");

        assertEquals(customer1, customer2);
        assertEquals(customer1.getId(), customer2.getId());
        assertEquals(customer1.getName(), customer2.getName());

        assertNotEquals(customer1, customer3);
        assertNotEquals(customer1.getName(), customer3.getName());
    }

    @Test
    void testCustomerEqualAndHashCodeExclude(){
        //walau name nya beda object nya tetap sama karena kita equals dan hashcodee nya hanya id nya saja
        Customer customer1 = new Customer("jk", "jekson");
        Customer customer2 = new Customer("jk", "tambunan");
        Customer customer3 = new Customer("tm", "jekson");

        assertEquals(customer1, customer2);
        assertEquals(customer1.getId(), customer2.getId());
        assertNotEquals(customer1.getName(), customer2.getName());

        assertNotEquals(customer1, customer3);
    }

}
