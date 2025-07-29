package Array;
import java.util.Scanner;

public class InsersionAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        arr[0] = 5;
        arr[1]= 10;
        arr[2] = 15;
        arr[3]= 18;
        arr[4] = 24;
        arr[5]= 30;

        System.out.println("Give an index where you want to insert your value.");
        int index = sc.nextInt();

        for(int i=5;i>=index;i--){
            arr[i+1]=arr[i];
        }

        System.out.println("Enter the element you want to insert at index.");
        arr[index] = sc.nextInt();

        for(int x :arr){
            System.out.print(x+",");
        }
    }
}
