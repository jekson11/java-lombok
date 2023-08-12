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
    }

    @Test
    void testVehicleWithBuilder(){
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("White");
        var vehicle = Vehicle.builder()
                .name("Car").brand("Honda").colors(colors).price(200000000L)
                .build();

        Assertions.assertNotNull(vehicle.getName());
    }

    @Test
    void testVehicleWithBuilderAndSingular(){
        Vehicle vehicle = Vehicle.builder()
                .name("Car").price(200000000L).brand("Honda")
                .color("blue").color("black").color("white")
                .build();
        Assertions.assertNotNull(vehicle.getName());

        log.info("{}", vehicle);
    }
}
