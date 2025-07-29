package Funtional_programmming_java;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

class Employe {
    private final String name;
    private final double baseSalary;
    private final double rating;

    public Employe(String name, double baseSalary, double rating) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getRating() {
        return rating;
    }

    public double computeFinalSalary() {
        return baseSalary + (baseSalary * 0.10); // 10% bonus
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', baseSalary=%.2f, finalSalary=%.2f, rating=%.1f}",
                name, baseSalary, computeFinalSalary(), rating);
    }
}

public class SurpriseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employe> employees = new ArrayList<>();

        // Step 1: Get user input for the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Base Salary: ");
            double baseSalary = scanner.nextDouble();

            double rating;
            while (true) {
                System.out.print("Rating (0.0 - 5.0): ");
                rating = scanner.nextDouble();
                if (rating >= 0 && rating <= 5) {
                    break;
                }
                System.out.println("Invalid rating! Please enter a value between 0 and 5.");
            }
            scanner.nextLine(); // Consume newline

            employees.add(new Employe(name, baseSalary, rating));
        }

        // Step 2: Filter employees eligible for a performance bonus (rating > 4.0)
        Predicate<Employe> isEligibleForBonus = emp -> emp.getRating() > 4.0;
        List<Employe> eligibleEmployees = employees.stream()
                .filter(isEligibleForBonus)
                .collect(Collectors.toList());

        System.out.println("\nEligible Employees for Bonus:");
        eligibleEmployees.forEach(System.out::println);

        // Step 3: Compute new salary using Function functional interface
        Function<Employe, Double> computeSalary = Employe::computeFinalSalary;
        Map<String, Double> updatedSalaries = eligibleEmployees.stream()
                .collect(Collectors.toMap(Employe::getName, computeSalary));

        System.out.println("\nUpdated Salaries:");
        updatedSalaries.forEach((name, salary) -> System.out.println(name + " -> " + salary));

        // Step 4: Sort employees in descending order based on the final salary
        List<Employe> sortedEmployees = eligibleEmployees.stream()
                .sorted(Comparator.comparingDouble(Employe::computeFinalSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("\nEmployees Sorted by Final Salary (Descending):");
        sortedEmployees.forEach(System.out::println);
    }
}