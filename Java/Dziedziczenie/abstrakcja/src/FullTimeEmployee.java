public class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String name, String hireDate, double fixedSalary) {
        super(name, hireDate);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public void calculateSalary() {
        salary = fixedSalary; // stała pensja
    }
}
