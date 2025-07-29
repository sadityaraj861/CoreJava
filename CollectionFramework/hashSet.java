import java.util.*;


public class hashSet {
    public static void main(String[] args){

       HashSet<Integer> hs = new HashSet<>(20,0.25f);

       hs.add(10);
       hs.add(20);
       hs.add(30);
       hs.add(10);


       //first printing method
        System.out.println(hs);

        //2nd printing method
        hs.forEach(x-> System.out.print(x+" "));
        System.out.println();

        //3rd printing method
       Iterator<Integer> it = hs.iterator();

       for(int i = 0;it.hasNext();){
           System.out.println(it.next());
       }

       //4th printing method
       for(Integer x:hs){
           System.out.print(x+" ");
       }

    }
}
