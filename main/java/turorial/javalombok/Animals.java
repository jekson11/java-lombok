package turorial.javalombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor//membuat constructor dengan field yang kita mau tapi field nya harus di buat final
//@RequiredArgsConstructor(staticName = "isRun") ini kalau kita ingin membuat method static
public class Animals {
    //tapi perlu di ingat karena kedua field ini final maka dia tidak akan ada setter nya kalau getter nya ada
    private final String name; //name akan menjadi parameter di constructor nya karna final
    private final String sound; //sound akan menjadi parameter di constructor nya karna final
    private String run;
}
