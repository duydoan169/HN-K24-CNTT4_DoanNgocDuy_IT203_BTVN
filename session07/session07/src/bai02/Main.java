package bai02;

public class Main {
    private String StudentName;

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        Main s1 = new Main();
        s1.StudentName = "Nguyen Van A";
        Main s2 = s1;
        s2.StudentName = "Nguyen Van B";
        System.out.println("s1:" + s1.StudentName);
        System.out.println("s2:" + s2.StudentName);
    }
}