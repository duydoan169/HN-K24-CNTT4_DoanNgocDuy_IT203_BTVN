package bai04;

public class Bai04 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(2, "Duy");
        Employee employee3 = new Employee(3, "Doan", 20000);

        employee1.showInfo();
        employee2.showInfo();
        employee3.showInfo();
    }
}
