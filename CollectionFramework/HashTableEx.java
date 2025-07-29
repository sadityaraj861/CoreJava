package CollectionFramework;
import java.util.*;

public class HashTableEx {
    public static void main(String[] args) {

        // Hashtable takes everything as object.
        //it is not an generic class , so no iterator is available for iteration.

        Hashtable<Integer,String> ht = new Hashtable<>();

        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");

        System.out.println(ht);
        ht.forEach((K,V)-> System.out.println(K+"="+V));

        Enumeration e =ht.keys();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
