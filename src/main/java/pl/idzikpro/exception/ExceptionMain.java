package pl.idzikpro.exception;

public class ExceptionMain {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        try {
            int sum = a + b;
            if (sum > 10) throw new ExceptionSumOver("sum over 10");
        } catch (ExceptionSumOver e) {
            System.out.println(e.getMessage());
        }
    }
}
