package Array;

public class IncreasingSizeOfArray {
    public static void main(String[] args) {

        int[] arr={8,6,10,9,2};
        int[] brr=  new int[2*arr.length]; // creation of bigger size array.

        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
        arr = brr; //changing reference of arr to newlyCreated Array.
        brr=null; // changing reference of the brr to null.

        for(int x:arr){
            System.out.print(x+",");
        }
      /*
        there is no way to change the size of the array ,but it can be doing by creating a new bigger size array and then changing
                the reference of previous array to new array.
      */
    }
}
