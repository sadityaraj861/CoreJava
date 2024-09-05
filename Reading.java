package Basic;
import java.lang.*;
import java.util.*;
  // for using scanner class to save value.

public class Reading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // new keyword is used to assign the storage.;; sc is  the new object of scanner class.

        System.out.println("input any name");
      // char name = sc.next().charAt(1);     // FOR READING THE FIRST CHARACTER.
        String name = sc.nextLine();// sc.next() for one word!! and sc.nextLine() for whole line.
        System.out.println(" name is "+name);

    }

}
