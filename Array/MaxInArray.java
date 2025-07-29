package Array;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr={23,45,67,8,96,1,45,89,87};
        int[] brr={-4,-2,-67,-5};
//ALWAYS INITIALIZE MAX WITH THE FIRST OR ANY ELEMENT OF THE ARRAY.
        int max=brr[0];

        for(int i=0;i<brr.length;i++){
            if(brr[i]>max) max=brr[i];
        }
        System.out.println(max);
    }
}
