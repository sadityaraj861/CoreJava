package Array;
import java.util.Scanner;
public class SearchingOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        System.out.println("enter the element you want to search in the array !!");
        int n = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("our element is found at index "+i);
                System.exit(0);  // it causes the program to exit immediately, and no further code is executed after the call to this method.
            }
        }
        System.out.println("not found!!");
    }
}
