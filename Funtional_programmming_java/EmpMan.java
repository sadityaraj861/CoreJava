package Funtional_programmming_java;

import java.util.*;

class Employee1 {
    String name;
    String dept;
    double salary;

    public Employee1(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Dept: " + dept + ", Salary: " + salary;
    }
}

public class EmpMan {
    public static void main(String[] args) {
        // List of employees
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("Aditya", "HR", 60000));
        employees.add(new Employee1("Sachin", "Engineering", 80000));
        employees.add(new Employee1("vikas", "Engineering", 70000));
        employees.add(new Employee1("Deepak", "Marketing", 50000));
        employees.add(new Employee1("kartik", "HR", 45000));

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter salary : ");
        double Salary = scanner.nextDouble();
        System.out.println("\nEmployees earning more than " + Salary + ":");
        for (Employee1 emp : employees) {
            if (emp.salary > Salary) {
                System.out.println(emp);
            }
        }

        System.out.print("\nEnter department to increase salary: ");
        String targetDept = scanner.next();
        System.out.print("Enter percentage increase: ");
        double percentage = scanner.nextDouble();

        for (Employee1 emp : employees) {
            if (emp.dept.equalsIgnoreCase(targetDept)) {
                emp.salary += emp.salary * (percentage / 100);
            }
        }

        System.out.println("\nUpdated employee list:");
        for (Employee1 emp : employees) {
            System.out.println(emp);
        }


        for (int i = 0; i < employees.size()-1; i++) {
            for (int j = 0; j < employees.size() - i - 1; j++) {
                if (employees.get(j).salary < employees.get(j + 1).salary) {
                    Employee1 temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nEmployees sorted by salary (descending):");
        for (Employee1 emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\nTop 3 highest-paid employees:");
        for (int i = 0; i < 3; i++) {
            System.out.println(employees.get(i).name);
        }

        scanner.close();
    }
}


