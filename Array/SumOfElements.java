package Array;

public class SumOfElements {
    public static void main(String[] args) {

        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        int sum = 0;
        for(int x:arr){
            sum = sum+x;
        }
        System.out.println("Sum of all element of array is "+sum);
        
    }
}
