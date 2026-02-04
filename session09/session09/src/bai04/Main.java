package bai04;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        // animal.bark(); -> LỖI BIÊN DỊCH (Compile-time Error)
        // Vì trình biên dịch chỉ nhìn vào kiểu dữ liệu khai báo (Animal),
        // mà Animal thì không có phương thức bark().
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }
}
