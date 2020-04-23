package pl.idzikpro.function;

import java.util.function.BinaryOperator;

public class BinaryOperatorMain {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (integer1, integer2) -> integer1 + integer2;
        System.out.println(binaryOperator.apply(12, 13));
    }
}
