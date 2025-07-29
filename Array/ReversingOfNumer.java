package Array;
import java.util.*;

public class ReversingOfNumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,Reversedno = 0;
        System.out.println("enter a number: ");
        num=sc.nextInt();

        while (num!=0){
            int digit = num%10;
            Reversedno = Reversedno*10 + digit;
            num = num/10;
        }

        System.out.println(Reversedno);

    }
}
