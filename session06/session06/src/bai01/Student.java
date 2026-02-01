package bai01;

public class Student {
    private int studentId;
    private String fullname;
    private int birthYear;
    private double averageScore;

    public Student(int studentId, String fullname, int birthYear, double averageScore) {
        this.studentId = studentId;
        this.fullname = fullname;
        this.birthYear = birthYear;
        this.averageScore = averageScore;
    }

    public void showStudent() {
        System.out.println(studentId + " " + fullname + " " + birthYear + " " + averageScore);
    }
}
