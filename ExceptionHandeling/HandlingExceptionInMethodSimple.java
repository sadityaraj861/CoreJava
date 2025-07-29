package ExceptionHandeling;

public class HandlingExceptionInMethodSimple {

    static int meth1() {
            return (10 / 0); // this is exception , if we cannot handle it their by using the tyy-catch block it goes from where it called.
    }
    static void meth2(){
        meth1();       // exception returns from meth1, if not handled their then it passes to meth3;
    }
    static void meth3(){
        meth2();      // exception returns from meth2, if not handled their then it passes to main();
    }
    public static void main(String[] args) {

        try{
            meth3();     // we can clearly see that here our exception is handeled.
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
