package pl.idzikpro.lambda;

public class LambdaMain {
    public static void main(String[] args) {
        Lambda<Integer> isEven = object -> object % 2 == 0;
        System.out.println(isEven.check(21));
    }
}
