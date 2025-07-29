package CollectionFramework;
import java.util.*;

public class ListDemoAndMethods {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        al1.add(10);
        al1.add(0,5);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

        System.out.println(al1);
        System.out.println(al2);


        al1.addAll(1,al2); //add all elements of al2 to al1 at index 1.
        System.out.println(al1);
        System.out.println(al1.subList(2,5));

        al1.retainAll(al2); //all elements of al1 gets deleted and al2 retained.
        System.out.println(al1);

        System.out.println();
        System.out.println("Is our both collections have same elements : "+al1.equals(al2));


        al1.remove(2); // deletes 70 which is at index 2
        System.out.println("after deletion of element "+ al1);
        System.out.println("50 contains or not : "+al1.contains(70));
        System.out.println(al1.indexOf(70));

      /* al1.removeAll(al2); // removes all elements.

        System.out.println(al1); // prints null*/

        for(Integer x:al1){
            System.out.print(x+" ");
        }
        System.out.println();

        //OR

        Iterator<Integer> it=al1.iterator();
        while(it.hasNext()){ // finds is their any next element.
            System.out.print(it.next()+" "); // gives current elements and moves to next element.
        }
        System.out.println();

        al1.forEach(x-> System.out.print(x+" ")); // lambda expression
        System.out.println();
        al1.forEach(x->show(x));


    }
    static void show(int x){
        if(x>70){
            System.out.print(x+" ");
        }
    }
}
