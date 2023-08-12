package turorial.javalombok;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data

public class Member {

    private String id;

    @NonNull private String name;

    public String sayHello(@NonNull String name){
        return "Hai "+name+" my name is "+this.name;
    }
}
