package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose factorial you want : ");
        int n = sc.nextInt();
        long fact = 1;

       /* for(int i=n;i>0;i--){
            fact = fact*i;
        }
        System.out.println("the factorial n number is "+product);*/

        for(int i=n;i<=n;i++){
            fact= fact*i;
        }

        System.out.println("the factorial n number is "+fact);
    }
}
