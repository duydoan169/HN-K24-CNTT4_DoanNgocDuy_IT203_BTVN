package bai05;

public class ProductionEmployee extends Employee{
    public ProductionEmployee() {
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.5;
    }
}
