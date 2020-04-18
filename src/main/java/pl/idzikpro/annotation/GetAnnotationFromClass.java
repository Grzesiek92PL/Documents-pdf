package pl.idzikpro.annotation;

import java.lang.annotation.Annotation;

public class GetAnnotationFromClass {
    public static void main(String[] args) {
        try {
            for (Annotation annotation : Person.class.getMethod("toString").getDeclaredAnnotations()
            ) {
                System.out.println(annotation.annotationType().getName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
