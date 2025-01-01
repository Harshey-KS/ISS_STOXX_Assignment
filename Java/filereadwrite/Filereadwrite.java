package Java.src.filereadwrite;

import java.io.*;

public class Filereadwrite {
    public static void main(String[] args) throws IOException {
        String filePath = "example.txt";

        // Writing to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, World!");
        }

        // Reading from file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}