package Array;
import java.util.Scanner;

public class DeletingAnElemennt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        arr[0] = 5;
        arr[1]= 10;
        arr[2] = 15;
        arr[3]= 18;
        arr[4] = 24;
        arr[5]= 30;

        for(int x:arr){
            System.out.print(x+",");
        }

        System.out.println("\nGive an index where you want to delete your value.");
        int index = sc.nextInt();

        for(int i=index+1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }

        for(int x:arr){
            System.out.print(x+",");
        }
    }
}
