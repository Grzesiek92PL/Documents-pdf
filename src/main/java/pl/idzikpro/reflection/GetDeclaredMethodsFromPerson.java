package pl.idzikpro.reflection;

import java.lang.reflect.Method;

public class GetDeclaredMethodsFromPerson {
    public static void main(String[] args) {

        //get all methods from Person class
        for (Method method : Person.class.getDeclaredMethods()
        ) {
            System.out.println(method.getName());
        }
    }
}
