package pl.idzikpro.classes;

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

        Animal cat=new Cat();
        cat.giveVoice();

        Animal[] animals={new Cat(), new Dog()};
        for (Animal animal:animals
             ) {
            if (animal instanceof Cat){
                Cat catAnimal=((Cat) animal);
                catAnimal.saySth();
            }
            if (animal instanceof Dog){
                Dog dogAnimal=((Dog) animal);
                dogAnimal.saySth();
            }
        }
    }
}
