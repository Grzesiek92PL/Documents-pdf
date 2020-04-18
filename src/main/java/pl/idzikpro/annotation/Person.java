package pl.idzikpro.annotation;

public class Person {
    @MyAnnotation(value1 = "field", value2 = "name")
    private String name;
    private int age;

    @MyAnnotation(value2 = "Person")
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    @MyAnnotation(value1 = "method", value2 = "toString")
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
