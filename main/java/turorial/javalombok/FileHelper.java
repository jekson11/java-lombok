package turorial.javalombok;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHelper {

    public static String loadFile(String file) throws IOException {
        //jika kita ingin membaca file kan biasanya kita buat seperti ini menggunakan try
        //untuk menutup FileReader Scanner dll yang bisa ditutup
        //nah kalau kita mengguankan cleanup annotaion kita tidak perlu menggunakan ini
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            Scanner scanner = null;
            try {
                scanner = new Scanner(System.in);
            }finally {
                if (scanner != null){
                    scanner.close();
                }
            }
        } finally {
            if (reader != null){
                reader.close();
            }
        }
        return file;
    }

    @SneakyThrows //dengan kita menambahkan ini maka kita tidak perlu lagi throws exception seperti ini throws IOException opada method kita
    //coba hapus SneakyThrowsnya pasti akan di suruh membuat throws exception penjelasan sneaky lebih lanjut baca aja di file
    public static String loadFileXml(String file)  {
        //dengan menggunakan annotation cleanup kita tidak perlu menggunakan try catch lagi untuk menutup file atau secenner dll yang bisa di tutup
        @Cleanup FileReader reader = new FileReader(file);
        @Cleanup Scanner scanner = new Scanner(reader);

        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()){
            builder.append(scanner.nextLine()).append("\n");
        }
        return builder.toString();
    }
}
