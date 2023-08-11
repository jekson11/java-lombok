package turorial.javalombok;

import lombok.Synchronized;

public class Counter {
    private static Integer value = 0;

//    @Synchronized //jkalau begini jadinya semua yang ada di method ini di synchronize jadi tidak flexsible
    //pada java thread kita sudah bahas bagaimana membuat kode synchronize yang lebih baik
    @Synchronized(value = "value") //kita bisa sharing lock seperti ini jadi buat valuenya field mana ynag mau di synchronize
    //kita bisa buat ini di semua method yang memuliki field value misalnya
    public static void increment(){
        value++;
    }

    public static Integer getData(){
        return value;
    }
}
