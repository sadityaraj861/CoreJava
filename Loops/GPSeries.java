package Loops;
import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term : ");
        int a = sc.nextInt();
        System.out.println("Enter the comman ratio : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of term you want : ");
        int n = sc.nextInt();

        int term = a;

        //GP me comman ratio hota hai ; AP me comman difference hota hai ..

        for(int i=0;i<10;i++){
            System.out.print(term+",");
            term = term*r;
        }
    }
}
