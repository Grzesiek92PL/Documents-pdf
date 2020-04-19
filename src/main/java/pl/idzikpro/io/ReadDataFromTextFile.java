package pl.idzikpro.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        String file = "src\\main\\java\\pl\\idzikpro\\io\\textdata.txt";

        //read text file char by char
        try (FileReader fileReader = new FileReader(file)) {
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //read text file line by line
        System.out.println();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
