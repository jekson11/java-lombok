package turorial.javalombok;

import lombok.Value;
import lombok.With;

@Value
@With
public class Register {
    String username;
    String password;
}
