package bai04;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Con chó đang ăn");
    }

    public void bark() {
        System.out.println("Woof woof");
    }
}
