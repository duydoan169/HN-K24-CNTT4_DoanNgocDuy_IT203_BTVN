package bai04;

public class Classroom {
    private static double classFund = 0;
    private String studentName;

    public Classroom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đóng: " + amount);
        }
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}
