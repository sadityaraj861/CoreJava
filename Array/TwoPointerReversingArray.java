package Array;

public class TwoPointerReversingArray {
    public static void main(String[] args) {
        //REVERSING AN ARRAY WITHOUT CREATING THE NEW ONE
        int[] arr={2,3,5,7,11,13,15,17,19,23,25};
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

        int i=0;
        int j=arr.length-1;
        int temp;

        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
