package Loops;
import java.util.Scanner;

public class ReversingNumberAndPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PALINDROME NUMBER : if the original number and the reversed number are the same then it is said to be PALINDROME NUMBER.

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        int r;
        int reverse = 0;
        int OriginalNumber = n;

        while(n>0){
            r = n %10;
            reverse = (reverse*10) + r;
            n = n/10;
        }
        System.out.println("reversed number : "+reverse);

        if(OriginalNumber==reverse){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
