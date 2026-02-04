package bai06;

public class Rectangle extends Shape {
    private int width;
    private int heigth;

    public Rectangle() {
    }

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double area(){
        return heigth*width;
    }
}
