package pl.idzikpro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamValueGenerator {
    public static void main(String[] args) {

        System.out.println("case 1 - using Stream.of()");
        Stream.of("A", "B", "c").forEach(s -> System.out.println(s));
        System.out.println("---------------------------");

        System.out.println("case 2 - filtering using Predicate");
        List<Student> students = Arrays.asList(
                new Student("Kasia", 22),
                new Student("Jacek", 32),
                new Student("Tomasz", 34)
        );
        students.stream().filter(s -> s.getAge() > 30).forEach(s -> System.out.println(s));
        System.out.println("---------------------------");

        System.out.println("case 3 - using Supplier");
        List<String> stringList = Arrays.asList("Kasia", "Jacek", "Monika");
        Random random = new Random();

        Stream.generate(() ->
                new Student(
                        stringList.get(random.nextInt(3)),
                        random.nextInt(40) + 20)
        ).limit(10).forEach(s -> System.out.println(s));
        System.out.println("---------------------------");

        System.out.println("case 4 - using iterate method");
        Stream.iterate(0, i -> i + 2).limit(10).forEach(System.out::println);
        System.out.println("---------------------------");

        System.out.println("case 5 - using IntStream");
        IntStream.rangeClosed(0, 18).filter(i -> i % 2 == 0).forEach(System.out::println);
        System.out.println("---------------------------");
    }
}
