package pl.idzikpro.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set=Set.copyOf(Arrays.asList("Kasia","Tomasz","Jacek"));
        //foreach
        for (String string:set
             ) {
            System.out.println(string);
        }
    }
}
