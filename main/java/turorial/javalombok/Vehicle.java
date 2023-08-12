package turorial.javalombok;

import lombok.*;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    private String name;
    private Long price;
    private String brand;
    @Singular
    private List<String> colors;
}
