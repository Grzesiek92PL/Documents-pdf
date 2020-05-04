package pl.idzikpro.classes;

public class Dog extends Animal implements Voice{
    @Override
    public void saySth() {
        System.out.println("Hau");
    }

    @Override
    public void giveVoice() {
        System.out.println("Dog voice");
    }
}
