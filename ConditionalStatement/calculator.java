package ConditionalStatement;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");

        float a = sc.nextFloat();

        System.out.println("enter b");

        float b = sc.nextFloat();

        System.out.println("operation");
        String s = sc.next();


        switch (s){
            case "+" :
                System.out.println(a+b);
                break;
            case "-":
                if(a>b){
                    System.out.println(a-b);
                } else if (a==b) {
                    System.out.println("both are equal");
                }else System.out.println("b-a");
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
        }
    }
}
