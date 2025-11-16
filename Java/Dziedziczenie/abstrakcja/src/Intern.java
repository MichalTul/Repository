public class Intern extends Employee {
    private double stipend; // stała kwota stypendium

    public Intern(String name, String hireDate, double stipend) {
        super(name, hireDate);
        this.stipend = stipend;
    }

    @Override
    public void calculateSalary() {
        salary = stipend;
    }
}
