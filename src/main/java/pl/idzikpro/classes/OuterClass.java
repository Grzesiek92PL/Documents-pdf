package pl.idzikpro.classes;

public class OuterClass {
    public class InnerClass{

    }
    public static class StaticInnerClass{

    }

    public InnerClass getInner(){
        return new InnerClass();
    }

    public StaticInnerClass getStaticInner(){
        return new StaticInnerClass();
    }
}
