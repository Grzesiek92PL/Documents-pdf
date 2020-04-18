package pl.idzikpro.reflection;

import java.lang.reflect.Method;

public class GetStringMethods {
    public static void main(String[] args) {

        //first case
        Class myFirstStringClass = String.class;
        for (Method method : myFirstStringClass.getDeclaredMethods()
        ) {
            System.out.println(method.getName());
        }

        //second case
        Class mySecondStringClass = "String".getClass();
        for (Method method : mySecondStringClass.getDeclaredMethods()
        ) {
            System.out.println(method.getName());
        }

        //third case
        try {
            Class myThirdStringClass = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Method method : mySecondStringClass.getDeclaredMethods()
        ) {
            System.out.println(method.getName());
        }

    }
}
