package bai01;

public class Student extends Person {
    public String studentId;
    public float avg;

    public Student(String fullName, int age, String studentId, float avg) {
        super(fullName, age);
        this.studentId = studentId;
        this.avg = avg;
    }

    @Override
    public void display(){
        System.out.printf("Họ và tên: %s - Tuổi: %d - MSSV: %s - Điểm tb: %.2f\n", super.fullName, super.age, studentId, avg);
    }
}
