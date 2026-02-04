package bai06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        Circle circle = new Circle(3);
        circle.area();

        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.area();

        shapes[0] = circle;
        shapes[1] = rectangle;

        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].area();
        }

        System.out.printf("\nTong dien tich cac hinh la: %.2f\n", sum);
    }
}
