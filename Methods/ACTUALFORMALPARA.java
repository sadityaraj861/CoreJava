package Methods;

public class ACTUALFORMALPARA {
    static int inc(int x){
        x++;
        return x; //here in formal parameter the copy of actual paramenter is send and the activity perform in the method
                  // are done on the formal parameter ,not on actual paramter.
    }

    public static void main(String[] args) {
      int a =10 , b= 15;

        System.out.println(inc(a)); //formal parameter incremented.
        System.out.println(a);     // actual parameter incremented.
    }
}
