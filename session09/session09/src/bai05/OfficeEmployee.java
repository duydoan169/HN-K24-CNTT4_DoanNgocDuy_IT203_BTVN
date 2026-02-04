package bai05;

public class OfficeEmployee extends Employee{

    public OfficeEmployee() {
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.25;
    }
}
