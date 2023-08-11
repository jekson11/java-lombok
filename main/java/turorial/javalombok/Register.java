package turorial.javalombok;

import lombok.Value;
import lombok.With;

//dengan menambahkan annotaion @Value itu artinya kita membuat object dan semuanya menjadi immutable yang artinya semua
//field parameter di constructor nya menjadi final dan untuk method nya hanya getter untuk setter nya tidak ada karena data class ini tidak bisa di ubah/immutable
@Value
//denga kita menambahkan ini dia akan membuat method dengan nama withXxx(nama fieldnya) ini ketika kita ingin
//membuat object yang berbeda tapi yang berbeda itu hanya 1 field nya saja
@With
public class Register {
    String username;
    String password;
}
