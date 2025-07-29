package PBLJ_Projects;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Employee2 {
    public static void main(String[] args) {
        int[] emp_no = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] emp_name = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        char[] design_code = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the emp no : ");
        int id = sc.nextInt();
        int index = -1;

        for (int i = 0; i < emp_no.length; i++) {
            if (id == emp_no[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee not exits "+id);
            return;
        } else {
            System.out.println(emp_name[index]);
            char deg_code = design_code[index];
            String Designation = "";
            int da = 0;

            switch (deg_code) {
                case 'e':
                    Designation = "Engineer";
                    da = 20000;
                    break;
                case 'c':
                    da = 32000;
                    Designation = "Consultant";
                    break;
                case 'k':
                    da = 12000;
                    Designation = "Clerk";
                    break;
                case 'r':
                    da = 15000;
                    Designation = "Receptionist";
                    break;
                default:
                    System.out.println("not found");
                    break;
            }
            int salary = basic[index] + hra[index] + da - it[index];

            System.out.println("Emp NO. EmpName Department Designation salary ");

            System.out.println(emp_no[index]+" \t "+emp_name[index] +" \t "+ dept[index] +" \t "+ Designation +"\t  "+ salary);
        }
    }
}
