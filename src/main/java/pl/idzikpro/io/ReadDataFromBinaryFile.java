package pl.idzikpro.io;

import java.io.*;

public class ReadDataFromBinaryFile {
    public static void main(String[] args) {
        String file = "src\\main\\java\\pl\\idzikpro\\io\\bindata.bin";
        int data = 0;

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File(file)))) {
            while (true) {
                data = dataInputStream.readInt();
                System.out.println(data);
            }
        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
