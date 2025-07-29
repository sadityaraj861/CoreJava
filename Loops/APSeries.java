package Loops;
import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first term : ");
        int a = sc.nextInt();
        System.out.println("Enter the comman difference : ");
        int d = sc.nextInt();
        System.out.println("Enter the number of term you want : ");
        int n = sc.nextInt();

        int term = a;

        System.out.println(a);
        for(int i=0;i<10;i++){
          System.out.print(term+",");
          term = term+d;
        }
    }
}
