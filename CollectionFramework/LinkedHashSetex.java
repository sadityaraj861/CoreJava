package CollectionFramework;
import java.util.*;


//maintains the order of insertion of elements.
public class LinkedHashSetex {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,6};

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(List.of(10,20,30,40,50,60));


        System.out.println(lhs);

        lhs.add(35);
        lhs.forEach(System.out::println);
/*

        Iterator<Integer> it = lhs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
*/


    }
}
