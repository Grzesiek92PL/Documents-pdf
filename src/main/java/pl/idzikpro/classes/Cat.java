package pl.idzikpro.classes;

public class Cat extends Animal implements Voice {

    @Override
    public void saySth() {
        System.out.println("Miau");
    }

    @Override
    public void giveVoice() {
        System.out.println("Cat voice");
    }
}







