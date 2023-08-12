package turorial.javalombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.concurrent.Executors;

@Data
@AllArgsConstructor()
@ToString(exclude = {"id"})
public class Product {
    private final String id;
    private String name;
    private Long price;
}
