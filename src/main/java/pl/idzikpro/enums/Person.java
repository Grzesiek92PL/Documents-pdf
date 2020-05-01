package pl.idzikpro.enums;

public class Person implements Comparable<Person>{
    private MobilePhone mobilePhone;
    private String name;
    private String surname;
    private int age;

    public Person(MobilePhone mobilePhone, String name, String surname, int age) {
        this.mobilePhone = mobilePhone;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.getMobilePhone().getSize()-o.getMobilePhone().getSize();
    }

    @Override
    public String toString() {
        return "Person{" +
                "mobilePhone=" + mobilePhone +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
