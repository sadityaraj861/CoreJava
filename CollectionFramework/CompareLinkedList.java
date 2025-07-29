package CollectionFramework;
import java.util.*;

public class CompareLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>(List.of(1,2,3,4,5,6,7));

        LinkedList<Integer> ll2 = new LinkedList<>(List.of(1,2,3,4,5,6,7));



        if(ll1.equals(ll2)==false){
            System.out.println(0);
        }
        else  System.out.println(1);

    }
}
