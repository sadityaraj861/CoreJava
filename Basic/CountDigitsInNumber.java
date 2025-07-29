package Basic;
import java.util.*;


public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int count=0;

        int i=0;
        while (N!=0){
            N=N/10;
            count++;
            i++;
        }

        System.out.println(count);
    }
}
