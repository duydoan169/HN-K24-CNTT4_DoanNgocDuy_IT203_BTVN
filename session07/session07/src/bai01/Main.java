package bai01;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nguyen Van A");
        Student s2 = new Student("SV02", "Nguyen Van B");
        Student s3 = new Student("SV03", "Nguyen Van C");

        s1.showInfo();
        System.out.println();

        s2.showInfo();
        System.out.println();

        s3.showInfo();
        System.out.println();

        Student.showTotalStudent();
    }
}

