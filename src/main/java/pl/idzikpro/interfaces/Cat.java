package pl.idzikpro.interfaces;

import pl.idzikpro.classes.Voice;

public class Cat implements Voice {
    @Override
    public void saySth() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        int a = 1;
        int b = 2;
        System.out.println("b+a : " + (b + a));
    }
}







