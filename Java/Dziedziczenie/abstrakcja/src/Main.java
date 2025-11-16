public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
            new FullTimeEmployee("Alice", "2022-01-10", 5000.0),
            new ContractEmployee("Bob", "2021-06-15", 50.0, 160), // 50 zł/h, 160 godzin
            new Intern("Charlie", "2023-03-01", 1500.0)
        };

        // Obliczamy pensje dla wszystkich pracowników
        for (Employee e : employees) {
            e.calculateSalary();
        }

        // Wyświetlamy informacje
        System.out.println("=== Employees salaries ===");
        for (Employee e : employees) {
            System.out.println(e.getInfo());
        }
    }
}
