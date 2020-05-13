package pl.idzikpro.collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Kasia",22);
        map.put("Tomasz",36);
        map.put("Jacek",30);
        //keys
        for (String key:map.keySet()
             ) {
            System.out.println(key);
        }
        //values
        for (Integer value:map.values()
             ) {
            System.out.println(value);
        }
        //key and values
        for (Map.Entry<String,Integer> element:map.entrySet()
             ) {
            System.out.println("Key :"+element.getKey());
            System.out.println("Value :"+element.getValue());
        }
    }
}
