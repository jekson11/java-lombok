package turorial.javalombok;

import lombok.*;
@Getter()
@EqualsAndHashCode(exclude = "name")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Setter(value = AccessLevel.PROTECTED)//mengubah visibility public private protected bebas ada semua
    private String id;

    @Setter(value = AccessLevel.PROTECTED)
    private String name;
}
