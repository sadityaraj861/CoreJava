package Loops;
import java.util.Scanner;

public class DisplayDigitsFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int r;

        while(n>0){
          r = n % 10;
          n = n / 10;
          System.out.println(r);
        }
    }
}
