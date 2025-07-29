package ClassAObject;

abstract class Super {
     public Super (){
         System.out.println("SUPER CONSTRUCTOR");
    }

    public void meth1(){
        System.out.println("SUPER METH 1");
    }
    abstract void meth2();
}

class Sub extends Super {
    @Override
    public void meth2(){
        System.out.println("SUB CLASS METH 2");
    }
}


public class abstractex {
    public static void main(String[] args) {
     //   Super s = new Super();                    // OBJ OF ABSTRACT CLASS CANNOT BE MADE BECAUSE IT NOT CLEARLY DEFINED.
        Super s1 = new Sub();
        s1.meth1();
        s1.meth2();
    }
}
