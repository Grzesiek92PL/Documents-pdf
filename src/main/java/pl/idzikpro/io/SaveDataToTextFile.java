package pl.idzikpro.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveDataToTextFile {
    public static void main(String[] args) {
        String file = "src\\main\\java\\pl\\idzikpro\\io\\textdata.txt";
        String data1 = "information1";
        String data2 = "information2";

        try (FileWriter fileWriter = new FileWriter(new File(file))){
            fileWriter.write(data1);
            fileWriter.write("\n");
            fileWriter.write(data2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
