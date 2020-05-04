package pl.idzikpro.interfaces;

public class Cat implements Voice {
    @Override
    public void saySth() {
        System.out.println("Miau");
    }

}