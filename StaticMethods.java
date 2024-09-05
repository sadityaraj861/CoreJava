package Basic;
import org.w3c.dom.ls.LSOutput;

class myclass{
    int a= 10;   // each copy for each object
    static int b = 20; // same copy for all object.

    void dikhaDe(){
        a=100;
        System.out.println(a);
    }
    void show(){  // NON-STATIC METHOD SO IT CAN TAKE ALL NON STATIC VARIABLE AS WELL AS STATIC VARIABLE
        System.out.println(a+" "+b);// non static method can take the static members.
        b=50;  // any change in value can effect the original value.
    }
    static void display(){  //STATIC METHOD SO IT CAN TAKE only NON STATIC VARIABLE.
        System.out.println(b);
    }

}

public class StaticMethods{
    public static void main(String[] args) {
       myclass mc = new myclass();
       myclass mc1 = new myclass();
        mc1.dikhaDe();
       mc.show(); // non static method need to call through object.
       myclass.display(); // static method can be called by using the class name.

    }
}
