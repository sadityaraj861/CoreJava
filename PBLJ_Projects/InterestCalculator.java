package PBLJ_Projects;

import java.util.Scanner;

// Abstract class Account
abstract class Account {
    double interestRate;
    double amount;
    abstract double calculateInterest();
}

// FDAccount class
class FDAccount extends Account {
    int noOfDays;
    int ageOfACHolder;

    FDAccount(double amount, int noOfDays, int ageOfACHolder) {
        if (amount < 0 || noOfDays < 0 || ageOfACHolder < 0) {
            throw new IllegalArgumentException("Invalid input.");
        }
        this.amount = amount;
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {
        if (amount >= 10000000) { // FD above 1 crore
            if (noOfDays <= 14) interestRate = 6.50;
            else if (noOfDays <= 29) interestRate = 6.75;
            else if (noOfDays <= 45) interestRate = 6.75;
            else if (noOfDays <= 60) interestRate = 8.00;
            else if (noOfDays <= 184) interestRate = 8.50;
            else interestRate = 10.00;
        } else { // FD below 1 crore
            if (noOfDays <= 14) interestRate = (ageOfACHolder >= 60) ? 5.00 : 4.50;
            else if (noOfDays <= 29) interestRate = (ageOfACHolder >= 60) ? 5.25 : 4.75;
            else if (noOfDays <= 45) interestRate = (ageOfACHolder >= 60) ? 6.00 : 5.50;
            else if (noOfDays <= 60) interestRate = (ageOfACHolder >= 60) ? 7.50 : 7.00;
            else if (noOfDays <= 184) interestRate = (ageOfACHolder >= 60) ? 8.00 : 7.50;
            else interestRate = (ageOfACHolder >= 60) ? 8.50 : 8.00;
        }
        return (amount * interestRate) / 100;
    }
}

// SBAccount class
class SBAccount extends Account {
    String accountType;

    SBAccount(double amount, String accountType) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount.");
        }
        this.amount = amount;
        this.accountType = accountType;
    }

    @Override
    double calculateInterest() {
        interestRate = accountType.equalsIgnoreCase("NRI") ? 6.00 : 4.00;
        return (amount * interestRate) / 100;
    }
}

// RDAccount class
class RDAccount extends Account {
    int noOfMonths;
    double monthlyAmount;
    int ageOfACHolder;

    RDAccount(double monthlyAmount, int noOfMonths, int ageOfACHolder) {
        if (monthlyAmount < 0 || noOfMonths < 0 || ageOfACHolder < 0) {
            throw new IllegalArgumentException("Invalid input.");
        }
        this.monthlyAmount = monthlyAmount;
        this.noOfMonths = noOfMonths;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {
        if (noOfMonths == 6) interestRate = (ageOfACHolder >= 60) ? 8.00 : 7.50;
        else if (noOfMonths == 9) interestRate = (ageOfACHolder >= 60) ? 8.25 : 7.75;
        else if (noOfMonths == 12) interestRate = (ageOfACHolder >= 60) ? 8.50 : 8.00;
        else if (noOfMonths == 15) interestRate = (ageOfACHolder >= 60) ? 8.75 : 8.25;
        else if (noOfMonths == 18) interestRate = (ageOfACHolder >= 60) ? 9.00 : 8.50;
        else if (noOfMonths == 21) interestRate = (ageOfACHolder >= 60) ? 9.25 : 8.75;
        return (monthlyAmount * interestRate) / 100;
    }
}

// Main Class
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select the option:");
            System.out.println("1. Interest Calculator – SB");
            System.out.println("2. Interest Calculator – FD");
            System.out.println("3. Interest Calculator – RD");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // SB Account
                    System.out.println("Enter the Average amount in your account:");
                    double sbAmount = sc.nextDouble();
                    System.out.println("Enter account type (Normal/NRI):");
                    String type = sc.next();
                    SBAccount sb = new SBAccount(sbAmount, type);
                    System.out.println("Interest gained: Rs. " + sb.calculateInterest());
                    break;

                case 2: // FD Account
                    System.out.println("Enter the FD amount:");
                    double fdAmount = sc.nextDouble();
                    System.out.println("Enter the number of days:");
                    int days = sc.nextInt();
                    System.out.println("Enter your age:");
                    int age = sc.nextInt();
                    try {
                        FDAccount fd = new FDAccount(fdAmount, days, age);
                        System.out.println("Interest gained: Rs. " + fd.calculateInterest());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3: // RD Account
                    System.out.println("Enter the monthly deposit amount:");
                    double rdAmount = sc.nextDouble();
                    System.out.println("Enter the number of months:");
                    int months = sc.nextInt();
                    System.out.println("Enter your age:");
                    int rdAge = sc.nextInt();
                    try {
                        RDAccount rd = new RDAccount(rdAmount, months, rdAge);
                        System.out.println("Interest gained: Rs. " + rd.calculateInterest());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}