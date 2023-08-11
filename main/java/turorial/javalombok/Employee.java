package turorial.javalombok;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@ToString()
@EqualsAndHashCode
public class Employee {
    private String name;
    private String id;
}
