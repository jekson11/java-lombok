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

    @SneakyThrows 
    public static String loadFileXml(String file)  {
        @Cleanup FileReader reader = new FileReader(file);
        @Cleanup Scanner scanner = new Scanner(reader);

        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()){
            builder.append(scanner.nextLine()).append("\n");
        }
        return builder.toString();
    }
}
