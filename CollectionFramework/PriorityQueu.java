package CollectionFramework;
import java.util.*;

// it is binary tree so it takes log n time for operation.

// priority queue behaves like binary heap data structure , in which the smallest element is present at the top.


class myCom implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2){
        if(o1<o2) return 1;
        if (o1>o2) return -1;
        return 0;
    }

}

public class PriorityQueu {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(new myCom());

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek()); // display top element not removes it
        pq.forEach(x-> System.out.print(x+" "));
        System.out.println();

        System.out.println("after deletion");
        pq.poll();

        pq.forEach(x-> System.out.print(x+" "));
    }
}
