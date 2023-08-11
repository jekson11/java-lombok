package turorial.javalombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor//membuat costructor tanpa parameter
@AllArgsConstructor//membut costructor dengan semua parameter yang ada di class nya
//@ToString //kalau begini semua field yang ada pada class akan di keluarkan di method toString
//ini akan membuat method toString tapi untuk field password tidak akan di toString ini bergunak
//ketika ada field yang bersifat rahasia dan kita tidak ingin menampilkannya jadi yang tampil ini hanya username saja
@ToString(exclude = "password")
public class Login {
    private String username;
    private String password;
}
