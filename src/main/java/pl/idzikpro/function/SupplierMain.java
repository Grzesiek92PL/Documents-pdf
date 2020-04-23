package pl.idzikpro.function;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Kasia", "Jacek", "Monika");
        Random random = new Random();
        Supplier<Student> supplierStudent = () -> new Student(
                stringList.get(random.nextInt(3)),
                random.nextInt(40) + 20);
        System.out.println(supplierStudent.get());
    }
}
