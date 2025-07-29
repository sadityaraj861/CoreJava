package LamdaExp;

@FunctionalInterface // I can use this because my interface has only a single method.
interface MyLambda{
    public void display(String s);
}

/* //1st way
class My implements MyLambda{

    public void display() {
        System.out.println("Hello World");
    }
}*/
public class LamdaDemo {
    public static void main(String[] args) {
        //2nd Way.
        /*Now, here, I'm creating an object of interface MyLambda
        and I'm overriding a method of that class, interface,
        right, overriding a method of that interface.
        So this is nothing but a anonymous inner class, right?*/


       /*
        MyLambda m= new MyLambda() {
            @Override
            public void display() {
                System.out.println("Hello World");
            }
        };

        */

        // so for this whole this we have to do very min in lambda that why its need to do in single line
        //() this demotes carry single method who define this sout("HW");
        MyLambda m= (s)->{System.out.println(s);};
        m.display("HelloWorld");
    }
}
