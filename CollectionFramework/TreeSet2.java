package CollectionFramework;
import java.util.*;


public class TreeSet2 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));

        System.out.println(ts);
        ts.add(25);

        System.out.println(ts.ceiling(45)); // cealing gives us greater than equalto number depends on the out set.

        System.out.println(ts.ceiling(55));

        System.out.println(ts.first());
        System.out.println(ts.floor(55)); // floor gives us smaller than or equal to.


        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());



    }
}
