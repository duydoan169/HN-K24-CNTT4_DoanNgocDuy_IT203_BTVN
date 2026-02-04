package bai01;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void display(){
        System.out.printf("Họ và tên: %s - Tuổi: %d\n", fullName, age);
    }
}
