package Basic;

public class WrapperClasses {
    public static void main(String[] args) {

        int i = 15;  // primitive  : - DOES NOT HAVE ANY METHODS
        Integer I = i;  // Integer class :- HAVE METHODS

        System.out.println(i);
        System.out.println(I);

        System.out.println(I.equals(i));


        Integer A = Integer.valueOf("123");
        int a = A;

        System.out.println(A);
        System.out.println(a);

    }
}
