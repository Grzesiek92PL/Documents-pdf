package pl.idzikpro.lambda;

public class IntegerLambdaMain {
    public static void main(String[] args) {

        IntegerMath add = (a, b) -> a + b;
        IntegerMath substract = (a, b) -> a - b;
        IntegerMath mnultiplay = (a, b) -> a * b;
        IntegerMath division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Can't divide by zero!");
            } else return (a / b);
        };

        System.out.println("10 / 3=" + operate(add, 10, 3));
    }

    private static double operate(IntegerMath lambda, double a, double b) {
        return lambda.getNumber(a, b);
    }
}
