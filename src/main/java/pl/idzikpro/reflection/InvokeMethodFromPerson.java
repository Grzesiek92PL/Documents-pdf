package pl.idzikpro.reflection;

import java.lang.reflect.Method;

public class InvokeMethodFromPerson {
    public static void main(String[] args) {
        try {
            Object myObject = Person.class.getConstructor(String.class,Integer.class).newInstance("Tomasz",20);
            Method myMethod = myObject.getClass().getMethod("toString");
            Object myReturn = myMethod.invoke(myObject);
            System.out.println(myReturn);
        } catch (Exception e) {

        }
    }
}
