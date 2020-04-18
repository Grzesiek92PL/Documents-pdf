package pl.idzikpro.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.CONSTRUCTOR
})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value1() default "hello";

    String value2();
}
