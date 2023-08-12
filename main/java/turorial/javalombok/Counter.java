package turorial.javalombok;

import lombok.Synchronized;

public class Counter {
    private static Integer value = 0;
    @Synchronized(value = "value") 
    public static void increment(){
        value++;
    }

    public static Integer getData(){
        return value;
    }
}
