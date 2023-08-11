package turorial.javalombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.concurrent.Executors;

//jika kita membuat seperti ini dan kita memiliki fied final maka fiedl tersebut
//akan di jadikan parameter pada constructor nya jika tidak meiliki field final maka constructornya tidak akan di buat
@Data
//kalau buat begini maka akan error karena ada field yang final yang artinya field tersebut harus di jadikan parameter pada constructor
//@NoArgsConstructor
@AllArgsConstructor()//ini otomatis semua di jadikan parameter pada constructor nya
//poko nya intinya walau di tambahkan annotation data kita tetap boleh mengedi class ini mau bagaimana bentuk constructornya methodnya dll
@ToString(exclude = {"id"})
public class Product {
    private final String id;
    private String name;
    private Long price;
}
