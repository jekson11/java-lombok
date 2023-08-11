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
    //tinggal tambahkan annotaion singular pada data container atau List Set, Map dll
    @Singular //Singular nya akan error jika namanya tidak merepresentasikan lebih dari satu
    private List<String> colors;
}
