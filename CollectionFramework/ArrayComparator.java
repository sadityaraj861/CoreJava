package CollectionFramework;
import java.util.*;
/*
        In Java, the Comparator interface is used to define a custom order for
        objects that don't have a natural ordering or when you want to override
        the natural ordering

        The Comparator interface has a single method: int compare(T o1, T o2);

        This method compares its two arguments for order. The return value determines
        the order of the two objects as follows:
        ⭐Negative value (-1, or any negative integer): This means that the first object (o1) is considered
        less than the second object (o2). When sorting, o1 will appear before o2.

        ⭐Zero (0): This means that the first object (o1) is considered equal to the second object (o2).
         Their order doesn't change relative to each other.

        ⭐Positive value (1, or any positive integer): This means that the first object (o1) is considered
        greater than the second object (o2). When sorting, o1 will appear after o2.
*/

class my implements Comparator<Integer>{

    public int compare(Integer i1,Integer i2){
        if(i1<i2){ // general order if i2 is greater than i1 then we return -1. but in this we reversing the natural order.
             return 1;
        } else if (i1>i2) {
            return -1;
        }else
            return 0;
    }
}

// if we have to change the order of sorting we have to implement the Comperator interface ,by default sort method uses comperable interface.

public class ArrayComparator {
    public static void main(String[] args) {
        Integer a[] ={2,4,6,8,1,3,5,7};

        //Arrays.sort(a);   follows natural ordering for sorting.
        Arrays.sort(a,new my()); // we have reversed the order so it gives decending order.
        for (Integer x:a){
            System.out.println(x);
        }
    }
}
