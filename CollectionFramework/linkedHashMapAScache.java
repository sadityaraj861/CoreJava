package CollectionFramework;
import java.util.*;

//Access order depends on the least resently used elements.
public class linkedHashMapAScache {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5; // eldest entry is removed. , if we follow the access order the least resently used is removed, if not follow the first inserted elements is removed.
            }
        };

        lhm.put(1,"A");
        lhm.put(2,"b");
        lhm.put(3,"c");

     //   lhm.forEach((k,v)-> System.out.println(k+" "+v));

        lhm.put(9,"I");
        lhm.put(8,"H");

        lhm.forEach((k,v)-> System.out.println(k+" "+v)); // they appear in the same order they inserted. 9 before 8.

        System.out.println("After the Accessed elements");

        lhm.get(1);//2nd last
        lhm.get(3); //least recently accessed.
        lhm.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println("After the insertion of 6th element");

        lhm.put(10,"J");
        lhm.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
