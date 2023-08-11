package turorial.javalombok;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataTest {
    private static final Logger log = LoggerFactory.getLogger(DataTest.class);
    @Test
    void testProductData(){
        //penjelasanny di class Product
        Product product = new Product("001","Keyboard", 500000L);

        log.info("{}",product.getId());
        log.info("{}",product.getName());
        log.info("{}",product.getPrice());

        log.info("{}", product);
    }
}
