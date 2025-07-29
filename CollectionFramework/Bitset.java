package CollectionFramework;
import java.util.*;


public class Bitset {
    public static void main(String[] args) {

        BitSet bit = new BitSet();

        bit.set(0);
        bit.set(2);
        bit.set(4);
        bit.set(6);
        bit.set(8);
        System.out.println(bit);
        System.out.println(bit.get(1)); // false

        BitSet bit2 = new BitSet();

        bit2.set(0);
        bit2.set(1);
        bit2.set(2);
        bit2.set(3);
        bit2.set(4);
        bit2.set(5);
        bit2.set(6);
        bit2.set(7);
        bit2.set(8);
        System.out.println(bit2.get(5)); //true
        System.out.println();

        bit.flip(0,bit.length());
        System.out.println(bit);



    }
}
