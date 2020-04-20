package pl.idzikpro.serialization;

import java.io.*;

public class DeserializationMain {
    public static void main(String[] args) {
        String file = "src\\main\\java\\pl\\idzikpro\\serialization\\serializationdata.bin";
        try (ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(new File(file)))){
            Object person=(Person)objectInputStream.readObject();
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
