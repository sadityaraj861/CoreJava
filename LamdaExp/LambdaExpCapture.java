package LamdaExp;

interface MyLambd{
    public void display();
}
class demo1{
    int temp=10;
    public void method1(){
      // outside Variable used in lambda expression should be final or effectively final..
        // (inside the lambda variable declared for those updation are allowed).
        int count=0;
        MyLambd ml=()->{
            System.out.println("hi"+count);//local variable can't update
            System.out.println("kaise ho"+(++temp));//instance variable can updatable
        };
        ml.display();
    }
}

class useLambda{
    public void callLambda(MyLambd ml){
        ml.display();
    }
}

class demo2{
    public void method2(){
        useLambda ul = new useLambda();
        ul.callLambda(()->{System.out.println("Hello from meth2");});
    }
}

public class LambdaExpCapture {
    public static void main(String[] args){
        demo1 d1= new demo1();
        d1.method1();

        demo2 d2 = new demo2();
        d2.method2();
    }
}
