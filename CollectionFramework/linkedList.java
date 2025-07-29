package CollectionFramework;

import java.util.*;

public class linkedList {
//ALL SIMILAR LIKE ARRAYLIST
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>(List.of(50,60,70,80,90));
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(40,30,20,10));



        System.out.print(ll1+" ");
        System.out.println();

        System.out.print(ll2+" ");
        System.out.println();

        ll2.addLast(0);


        System.out.print(ll1.addAll(ll2));//returns true
        System.out.println();

        System.out.println(ll1+" ");

        ll2.retainAll(ll1); //doesn't delete any thing because ll1 not present in ll2.
        System.out.println(ll2+" ");

        System.out.println("First element of ll1 "+ll1.peekFirst());
        System.out.println("last element of ll1 "+ll1.peekLast());
        System.out.println("First element of ll2 "+ll2.peekFirst());
        System.out.println("last element of ll2 "+ll2.peekLast());


    }
}
