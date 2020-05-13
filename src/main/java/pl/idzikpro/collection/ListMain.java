package pl.idzikpro.collection;

import java.util.Arrays;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Kasia","Tomasz","Jacek");
        //fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //foreach
        for (String string:list
             ) {
            System.out.println(string);
        }
    }
}
