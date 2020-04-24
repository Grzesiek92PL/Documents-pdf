package pl.idzikpro.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Kasia", 22),
                new Student("Jacek", 32),
                new Student("Tomasz", 34),
                new Student("Jacek", 21)
        );
        System.out.println("case 1 - find first occurence of Jacek");
        students.stream()
                .filter(s -> "Jacek".equals(s.getName()))
                .findFirst()
                .ifPresent(s -> System.out.println(s));
        System.out.println("---------------------------------------");

        System.out.println("case 2 - are there any Jacek?");
        students.stream()
                .map(s -> s.getName())
                .filter(s -> "Jacek".equals(s))
                .findAny()
                .ifPresent(System.out::println);
        System.out.println("---------------------------------------");

        System.out.println("case 3 - are all string palindroms");
        System.out.println(students.stream()
                .map(s -> s.getName())
                .allMatch(s -> s.equals(new StringBuilder(s).reverse())));
        System.out.println("---------------------------------------");


        System.out.println("case 4 - we sum 10 integers");
        System.out.println(Stream.generate(Math::random)
                .limit(10)
                .reduce(0.0, (a, b) -> a + b));
        System.out.println("---------------------------------------");

        System.out.println("case 5 - the oldest student");
        students.stream()
                .map(s -> s.getAge())
                .max(Comparator.naturalOrder())
                .ifPresent(age -> System.out.println(age));
        System.out.println("---------------------------------------");

        System.out.println("case 5a - the oldest student");
        students.stream()
                .map(s -> s.getAge())
                .reduce(Integer::max)
                .ifPresent(age -> System.out.println(age));
        System.out.println("---------------------------------------");


        System.out.println("case 6 - getting list of student's age");
        List<Integer> ageList = students.stream()
                .map(s -> s.getAge())
                .collect(Collectors.toList());
        System.out.println(ageList);
        System.out.println("---------------------------------------");

        System.out.println("case 7 - joing all String into one with separator");
        String strStudent=students.stream()
                .map(s->s.getName())
                .collect(Collectors.joining(";"));
        System.out.println(strStudent);
        System.out.println("---------------------------------------");

        System.out.println("case 8 - map showing students at each age");
        Map<Integer,List<Student>> studentMap=students.stream()
                .collect(Collectors.groupingBy(Student::getAge));
        System.out.println(studentMap);
        System.out.println("---------------------------------------");

        System.out.println("case 9 - summary statistics");
        System.out.println(students.stream()
                .mapToInt(s -> s.getAge())
                .summaryStatistics());
        System.out.println("---------------------------------------");

    }
}
