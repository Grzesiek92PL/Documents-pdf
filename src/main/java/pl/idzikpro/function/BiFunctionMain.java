package pl.idzikpro.function;

import java.util.function.BiFunction;

public class BiFunctionMain {
    public static void main(String[] args) {
        BiFunction<String, Integer, Student> biFunction = (s, integer) -> new Student(s, integer);
        System.out.println(biFunction.apply("Leszek", 32));
    }
}
