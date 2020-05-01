package pl.idzikpro.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MobilePhoneMain {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(MobilePhone.ANDROID, "Jacek", "Placek", 42),
                new Person(MobilePhone.IOS, "Tomasz", "Krzysztof", 21),
                new Person(MobilePhone.WINDOWS, "Kasia", "Skrzynecka", 20)
        );
        //sorting in size of screen order ascending
        Collections.sort(personList);
        int sizeSearch = 5;
        personList.stream()
                .filter(p -> p.getMobilePhone().getSize() == sizeSearch)
                .forEach(System.out::println);
    }
}
