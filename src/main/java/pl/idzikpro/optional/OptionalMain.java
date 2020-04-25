package pl.idzikpro.optional;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        // case 0 - the value may be null - Optional.ofNullable()
        Student stMaybeNull = null;
        Optional<Student> studentMaybeNull = Optional.ofNullable(stMaybeNull);
        studentMaybeNull.ifPresent(System.out::println);

        //case 1 - the value can not be null - Optional.of()
        Student stNotNull = new Student("Jacek", 23);
        Optional<Student> studentNotNull = Optional.of(stNotNull);
        System.out.println(studentNotNull.get());


        //case 3 - the value is empty
        Optional<Student> stEmpty = Optional.empty();

        // using Optional
        List<Student> list = Arrays.asList(
                new Student("Kasia", 22),
                new Student("Jacek", 21),
                new Student("Lucyna", 30)
        );

        Optional<Student> optionalAgeOver30Student = list.stream()
                .filter(student -> student.getAge() > 30)
                .findFirst();
        //case - using ifPresent
        optionalAgeOver30Student.ifPresent(st -> System.out.println(st));

        //case - using ifPresentOrElse
        optionalAgeOver30Student
                .ifPresentOrElse(
                        st -> System.out.println(st),
                        () -> System.out.println("No such student")
                );

        //case - using orElseThrow
        try {
            optionalAgeOver30Student
                    .orElseThrow(NoSuchElementException::new);
        } catch (NoSuchElementException e) {

        }

        //case - using orElseGet
        System.out.println(optionalAgeOver30Student
                .orElseGet(() -> new Student("Joanna", 31)));

    }
}
