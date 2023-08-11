package turorial.javalombok;

import org.junit.jupiter.api.Test;

public class GetterSetterTest {
    @Test
    void testCostumer(){
        Customer customer = new Customer();
        customer.setId("001");
        customer.setName("Jekson");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }
}
