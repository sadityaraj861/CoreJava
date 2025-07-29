package Loops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 0th term : ");
        int ZerothTerm = sc.nextInt();
        System.out.println("Enter the 1st term : ");
        int FirstTerm = sc.nextInt();

        System.out.println("Enter the no of term you want : ");
        int NoOfTerms = sc.nextInt();

        int a = ZerothTerm;
        int b = FirstTerm;
        int  c;

        System.out.print(a+","+b+",");

        for(int i=0;i<NoOfTerms-2;i++){
           c = a+b;
           System.out.print(c+",");
           a=b;
           b=c;
        }
    }
}
