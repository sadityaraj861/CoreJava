package Loops;
import java.util.Scanner;

public class SumOfNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till you want the sum : ");
        int n = sc.nextInt();
        int Sum = 0;

        for(int i = 1;i<=n;i++){
            Sum = Sum+i;
        }
        System.out.println("the sum of first n number is "+Sum);
    }
}
