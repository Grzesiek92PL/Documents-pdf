package pl.idzikpro.function;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Student student = new Student("Kasia", 22);
        Function<Student, String> functionStudentName = student1 -> student1.getName();
        System.out.println(functionStudentName.apply(student));
    }
}
