package ConditionalStatement;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        boolean prime=true;

        int n = sc.nextInt();


        if(n==1 || n==2){
            System.out.println("our number is prime number");
        }else if(n>2) {
            for(int i=2;i<n;i++){

                if(n%i==0){
                    prime=false;
                    System.out.println("our "+n+" is not prime!!");
                    return;
                }
            }
        }


        if(prime = true){
            System.out.println("Our "+n+" is prime no!!");
        }
    }
}
