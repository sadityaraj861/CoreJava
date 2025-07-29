package CollectionFramework;
import java.util.*;
// All implementation of Arraydeque is done in constant time.
public class ArrayDequ {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq1 = new ArrayDeque<>(List.of(10,20,30,40,50));

        ArrayDeque<String> dq2 = new ArrayDeque<>(List.of("Aditya","Sachin","Nikhil"));

        System.out.print("size of dq1 is : "+dq1.size());
        System.out.println();

        System.out.print("size of dq2 is : "+dq2.size());
        System.out.println();

        System.out.println(dq1);

        dq1.addLast(60);
        System.out.println(dq1);

        dq1.removeLast();
        dq1.forEach((x)-> System.out.print(x+" "));

        for(Iterator<Integer> it =dq1.iterator(); it.hasNext();  ){
            System.out.println(it.next());
        }
    }
}
