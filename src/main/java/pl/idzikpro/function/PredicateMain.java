package pl.idzikpro.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Michał", 32),
                new Student("Kasia", 31),
                new Student("Jacek", 30)
        );
        Predicate<Student> predicateAgeOver30 = student -> student.getAge() > 30;
        for (Student student : studentList
        ) {
            if (predicateAgeOver30.test(student)) {
                System.out.println(student);
            }
        }
    }
}
