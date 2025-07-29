package Basic;
import java.util.*;

public class SumOfnWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

        int n=sc.nextInt();
        sum=(n*(n+1))/2;
        System.out.println("Sum of First n Number is "+sum);

    }
}
