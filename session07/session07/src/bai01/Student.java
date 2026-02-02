package bai01;

public class Student {
    private String studentId;
    private String studentName;

    private static int totalStudent = 0;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    public void showInfo() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Tên SV: " + studentName);
    }

    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên: " + totalStudent);
    }
}

