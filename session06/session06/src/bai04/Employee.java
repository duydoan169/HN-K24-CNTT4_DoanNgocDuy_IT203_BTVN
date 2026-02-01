package bai04;

public class Employee {
    private int employeeId;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee(int employeeId, String name, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("Id: " + employeeId + " Ten: " + name + " Salary: " + salary);
    }
}
