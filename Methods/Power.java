package Methods;

import java.util.Scanner;

public class Power {
    static double power(double a,double b){
        double powe=1;
        for(int i=1;i<=b;i++){
            powe*=a;
        }
        return powe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Power by manual function :"+power(a,b));
        System.out.println("Power by builtin function :"+Math.pow(a,b));
    }
}
