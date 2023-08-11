package turorial.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BuilderTest {
    private static final Logger log = LoggerFactory.getLogger(BuilderTest.class);
    @Test
    void testVehicleWithOutBuilder(){
        //ini cara bias jika pembuatan object dari sebuah class
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("White");
        Vehicle vehicle = new Vehicle("Car", 200000000L, "Honda", colors);
        Assertions.assertNotNull(vehicle.getName());

        //or
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Car");
        vehicle1.setPrice(200000000L);
        vehicle1.setBrand("Honda");
        vehicle1.setColors(colors);
        Assertions.assertNotNull(vehicle1.getName());

        //inikan ribet terlalubanya nah dengan menggunakan @Builder annotation pada class nya Vehicle yang kita buat
        //kita bisa membuat nya lebih simple dan mudah di baca
    }

    @Test
    void testVehicleWithBuilder(){
        //ini jika kita menambahkan annotation @Builder
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("White");

        //dia akan otomatis membuat method builder dan build di mana build untuk menutup dan builder untuk membuka
        //di dalamnya kita bisa langsung chining data object nya tanpa menggunakan objec class nya
        var vehicle = Vehicle.builder()//menggunakan method builder dan di akhiri dengan method build
                .name("Car").brand("Honda").colors(colors).price(200000000L)
                .build();

        Assertions.assertNotNull(vehicle.getName());
    }

    @Test
    void testVehicleWithBuilderAndSingular(){
        //dan ini jika kita menambahkan annotation @Singular pada field yang bertipe data container seperti List Set dll
        //dengan kita tambahkan annotation itu kita tidak perlu lagi membuat List nya untuk mengisi field color yang
        //bertipe data List kita bisa langsung meng chining nya di dalam method builder nya method color itu otomatis
        //di buat sesuai nama field List yang kita buat misal namanya colors maka akan di buat method color misal lagi
        //namanya hobbies maka akan di buat method hobby jadi nama field nya usahakan harus merepresantasikan
        //lebih sari satu y
        Vehicle vehicle = Vehicle.builder()
                .name("Car").price(200000000L).brand("Honda")
                .color("blue").color("black").color("white")
                .build();
        Assertions.assertNotNull(vehicle.getName());

        log.info("{}", vehicle);
    }
}
