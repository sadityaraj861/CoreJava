package Array;
import java.util.Scanner;

public class GivingInputForArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a size whose you want to crete an array");
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" element.");
            a[i] = sc.nextInt();
        }
        System.out.println("INPUT GIVEN SUCCESSFULLY!!");

        for(int x:a){
            System.out.print(x+",");
        }
    }
}
