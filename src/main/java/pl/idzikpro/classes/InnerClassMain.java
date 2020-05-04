package pl.idzikpro.classes;

public class InnerClassMain {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass inner1 = outerClass.getInner();
        OuterClass.InnerClass inner2 = outerClass.new InnerClass();

        OuterClass.StaticInnerClass staticInner1=outerClass.getStaticInner();
        OuterClass.StaticInnerClass staticInner2=new OuterClass.StaticInnerClass();
    }
}
