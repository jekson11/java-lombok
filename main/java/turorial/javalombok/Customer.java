package turorial.javalombok;

import lombok.*;

//kalau kita membuat nya di class nya maka secara otomatis semua field nya akan punya getter dan setter
@Getter()//kalau begini ini default nya public
//@EqualsAndHashCode //ini akan membuta semua field nya di equals dan di hashCode
//dengan begini name nya tidak akan di equals dan di hashCode ini jika kita ingin beberapa
//field tidak di equals dan di hashCode ini array y tinggal tambahkan {} di dalam itu kita bebas mau masukkan berap field
@EqualsAndHashCode(exclude = "name")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Setter(value = AccessLevel.PROTECTED)//mengubah visibility public private protected bebas ada semua
    private String id;

    @Setter(value = AccessLevel.PROTECTED)
    private String name;
}
