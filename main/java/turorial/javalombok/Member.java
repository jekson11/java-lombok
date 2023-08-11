package turorial.javalombok;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data

public class Member {

    private String id;
    //dengan kita menambahkan annotaion @NonNUll itu artinya field tersebut akan otomatis di jadikan parameter
    //pada constructor class tersebut dan juga akan sekalian di buat pengecekan bahwa field nya tikdak boleh null
    //ini cocok menggantikan annotation @RequiredArgsConstructor yang membuat container yang memiliki constructor
    //tapi ketika fiedl nya di set menjadi final
    @NonNull private String name;

    //nonnull juga bisa di set di parameter method atau constructor dia akan melakukan pengecekan tidak boleh null
    public String sayHello(@NonNull String name){
        return "Hai "+name+" my name is "+this.name;
    }
}
