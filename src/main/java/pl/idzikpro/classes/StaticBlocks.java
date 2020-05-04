package pl.idzikpro.classes;

public class StaticBlocks {
    {
        System.out.println("block");
    }

    static {
        System.out.println("static block");
    }

    public StaticBlocks() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        StaticBlocks staticBlocks=new StaticBlocks();
    }
}
