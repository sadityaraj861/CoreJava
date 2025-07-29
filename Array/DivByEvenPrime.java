package Array;

import java.util.Scanner;

public class DivByEvenPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter all elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int x:arr){
            if (x%2==0) System.out.println(x);
        }
    }
}
