package CollectionFramework;
import java.util.*;

public class ArraysMethod {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,1,3,5,7};
        int b[] = {2,4,6,8,11,3,5};

        //      System.out.println(Arrays.compare(a,b)); // compares each array element by element and length also, and element value also.
        // if any value is change at any place it check which value is greater then gives the -1,+1,0.
        //if length of elements mismatches it give the difference of count.

        int c[] = Arrays.copyOf(b,b.length);

        for(int x:c){
            System.out.print(x+" ");
        }
        System.out.println();

        Arrays.sort(a);
        Arrays.sort(c);
        System.out.println(Arrays.toString(a)); // toString method is used because if we print direct (a), it gives hexadecimal value so we have to change it in to String for display.

        //Comparision is very important for sorting of array.
 //     System.out.println(Arrays.binarySearch(b,11)); // gives wrong value of array is not sorted.

        System.out.println(Arrays.binarySearch(a,8));


    }
}
