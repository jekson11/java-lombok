package turorial.javalombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class Animals {
    private final String name;
    private final String sound;
    private String run;
}
