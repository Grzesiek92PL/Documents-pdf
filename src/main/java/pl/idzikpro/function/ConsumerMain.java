package pl.idzikpro.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Michał", 32),
                new Student("Kasia", 31),
                new Student("Jacek", 30)
        );
        Consumer<Student> consumerName = student -> System.out.println(student.getName());
        for (Student student : studentList
        ) {
            consumerName.accept(student);
        }
    }
}
