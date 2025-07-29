package Loops;
import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

      // Armstrong number : if the sum of the cube of the digits of numbers is equal to the original number then it is said to be armstrong.
      // ex: 153 = 1^3 + 5^3 + 3^3  = 153

        int r ;
        int sum = 0;
        int OriginalNumber = n ; // this Original value variable is created to store the value of the n, because when loop ends
                                 // our n becomes 0 ;
        while(n>0){
            r = n % 10;
            sum = sum + (r*r*r);
            n = n/10;
        }

        System.out.println("Sum of the cube of the digits of numbers is : "+sum);

        if(sum==OriginalNumber){
            System.out.println("yes, our number is Armstrong!!");
        }else {
            System.out.println("no, our number is not Armstrong");
        }
    }
}
