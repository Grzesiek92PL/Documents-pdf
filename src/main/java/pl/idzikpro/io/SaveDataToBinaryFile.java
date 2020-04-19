package pl.idzikpro.io;

import java.io.*;

public class SaveDataToBinaryFile {
    public static void main(String[] args) {
        String file = "src\\main\\java\\pl\\idzikpro\\io\\bindata.bin";
        int data1 = 1234567;
        int data2 = 7654321;

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file)))){
            dataOutputStream.writeInt(data1);
            dataOutputStream.writeInt(data2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
