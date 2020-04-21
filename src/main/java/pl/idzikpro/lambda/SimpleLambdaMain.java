package pl.idzikpro.lambda;

public class SimpleLambdaMain {
    public static void main(String[] args) {
        SimpleLambda lambda = (s, k) -> {
            return "Imię " + s + " a nazwisko " + k;
        };
        System.out.println(lambda.getName("Tomasz", "Idzik"));
    }
}
