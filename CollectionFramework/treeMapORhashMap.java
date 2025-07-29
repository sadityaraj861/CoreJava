package CollectionFramework;
import java.util.*;
import java.lang.*;


public class treeMapORhashMap {
    public static void main(String[] args) {

/*
⭐tree takes log(n) time for basic operation ; it is shorted
⭐hash takes O(1) time for basic operation ; it is not shorted.
 */
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));
//      HashMap<Integer, String> tm = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));
        System.out.println(tm);


        tm.put(6,"f");
        System.out.println(tm);

        System.out.println(tm.lastKey()); //6
        System.out.println(tm.ceilingEntry(4).getValue()); //6=f
        System.out.println(tm.values());  // gives set of values.

        System.out.println(tm.get(2));

        System.out.println(tm.getClass()); // java.util.TreeMap

        System.out.println(tm.entrySet());

        //lambda expression with 2 parameter.
        tm.forEach((k,v)-> System.out.println(k+" = "+v));

        tm.clear(); // clears all key value pairs.
        System.out.println(tm); // empty set
    }
}
