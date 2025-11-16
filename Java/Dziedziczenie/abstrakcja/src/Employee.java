public abstract class Employee {
    private String name;
    private String hireDate;
    protected double salary; // chronione, żeby klasy potomne mogły ustawić

    public Employee(String name, String hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract void calculateSalary(); // abstrakcyjna metoda do obliczenia pensji

    public String getInfo() {
        return "Name: " + name + ", Hire Date: " + hireDate + ", Salary: " + String.format("%.2f", salary);
    }
}
