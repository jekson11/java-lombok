package turorial.javalombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "password")
public class Login {
    private String username;
    private String password;
}
