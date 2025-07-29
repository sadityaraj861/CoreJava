package Funtional_programmming_java;

import java.util.*;
import java.util.function.*;


class Employee {
    private final int id;
    private final String name;
    private final double salary;
    private final int performanceRating;

    public Employee() {
        this.id = 0;
        this.name = "Default";
        this.salary = 0.0;
        this.performanceRating = 1;
    }

    public Employee(int id, String name, double salary, int performanceRating) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    // Instance method for method reference
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", performanceRating=" + performanceRating +
                '}';
    }

}

class EmployeeBonusCalculator {
    public static double calculateBonus(Employee e) {
        return e.getPerformanceRating() * 0.1 * e.getSalary();
    }
}
public class Test2 {
    public static void main(String[] args) {

        List<Employee> employees=Arrays.asList(
                new Employee(100,"Aditya",5000,1),
                new Employee(200,"Sachin",6000,3),
                new Employee(300,"Vivek",8000,4)
        );
        Function<Employee,Double> bonusCal=EmployeeBonusCalculator::calculateBonus;
        Consumer<Employee> printer = Employee::printDetails;
        employees.forEach(printer);

        Supplier<Employee> defaultEmployeeSupplier = Employee::new;
        Employee defaultEmp = defaultEmployeeSupplier.get();

        System.out.println("|Default Employee: |" + defaultEmp);

        System.out.println("EMPLOYEE BONUSES: ");
        employees.forEach(emp -> {
            double bonus = bonusCal.apply(emp);
            System.out.println("Bonus for " + emp.getName() + ": " + bonus);
        });



    }

}
