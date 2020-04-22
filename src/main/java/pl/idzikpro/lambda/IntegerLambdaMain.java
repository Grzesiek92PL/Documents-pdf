package pl.idzikpro.lambda;

public class IntegerLambdaMain {
    public static void main(String[] args) {


        IntegerMath<Integer> add = (a, b) -> a + b;
        IntegerMath<Integer> substract = (a, b) -> a - b;
        IntegerMath<Integer> multiplay = (a, b) -> a * b;
        IntegerMath<Integer> division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Can't divide by zero!");
            } else return (a / b);
        };

        System.out.println("10 / 3=" + operate(add, 10, 3));
    }

    private static double operate(IntegerMath<Integer> lambda, Integer a, Integer b) {
        return lambda.getNumber(a, b);
    }
}
