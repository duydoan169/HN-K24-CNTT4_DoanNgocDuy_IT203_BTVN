package bai05;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new OfficeEmployee(), new ProductionEmployee(),new Employee()};
        double sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].calculateSalary();
        }

        System.out.println("Tong luong: " + sum);
    }
}
