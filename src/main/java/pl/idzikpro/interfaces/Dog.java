package pl.idzikpro.interfaces;

import pl.idzikpro.classes.Voice;

public class Dog implements Voice {
    @Override
    public void saySth() {
        System.out.println("Hau");
    }

}
