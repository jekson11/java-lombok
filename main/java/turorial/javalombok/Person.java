package turorial.javalombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(staticName = "sayHello")//membuat method static dengan nama sayHello tidak ada parameter
@AllArgsConstructor(staticName = "sayHai")//membuat method static dengan nama sayHai semua parameter yang ada di class
public class Person {
    private String name;
    private String message;
}
