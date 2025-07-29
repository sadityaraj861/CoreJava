import java.util.*;
public class PowerFunction {

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }else if(n<0 && n%2==0){
            return x*power(x,n+1);
        }else if(n<0 && n%2!=0) {
            return -(x * power(x, n + 1));
        }else return x*power(x,n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 2.0;
        /*int n = 10;
        double result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);*/

        // Testing with negative exponent
        int n2 = -3;
        double result2 = power(x, n2);
        System.out.println(x + "^" + n2 + " = " + result2);
        /*String msg= sc.nextLine();
        System.out.println(msg);

        StringBuilder sb = new StringBuilder(msg);
        System.out.println(sb.reverse());*/


    }
}
