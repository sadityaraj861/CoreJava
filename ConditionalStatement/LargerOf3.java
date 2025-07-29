package ConditionalStatement;

import java.util.Scanner;

public class LargerOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a");
        int a = sc.nextInt();

        System.out.println("enter b");
        int b = sc.nextInt();

        System.out.println("enter c");
        int c = sc.nextInt();

        if (a > b) {
            if(a>c){
                System.out.println("A is greater");
            }else System.out.println("c is greater");

        } else if (b>a) {
            if (b>c){
                System.out.println("B is greatest.");
            }else if (b<c)System.out.println("c is greatest");

        } else if (a==b && b==c) {
            System.out.println("A,B,c are equal.");
        } else if (a==b  ) {
            if (a>c){
                System.out.println("a and b is greatest");
            }else System.out.println("c is greatest");
        }else if(b==c){
            if (b>a){
                System.out.println("b and c are greatest");
            }else System.out.println("a is greatest");
        }
    }
}
