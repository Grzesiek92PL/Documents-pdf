package pl.idzikpro.interfaces;

import java.util.Arrays;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        List<Voice> voiceList = Arrays.asList(
                new Cat(),
                new Dog()
        );

        for (Voice animal : voiceList
        ) {
            animal.saySth();
        }
    }
}
