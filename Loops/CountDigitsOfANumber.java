package Loops;
import java.util.Scanner;

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        long n = sc.nextLong();
        int count= 0 ;

        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("No of digits in given number is : "+count);

    }
}
