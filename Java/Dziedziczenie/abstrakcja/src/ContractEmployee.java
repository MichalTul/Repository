public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, String hireDate, double hourlyRate, int hoursWorked) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        salary = hourlyRate * hoursWorked;
    }
}
