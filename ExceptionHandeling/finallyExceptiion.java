
package ExceptionHandeling;

public class finallyExceptiion { //note⭐⭐ : if we handled all exception  then no need to use finally{} block for our necessary
    // program we can simply print it. and IF BY-ANY CHANCE any EXCEPTION IS NOT HANDLED SO; very important to use finally{} block for our necessary lines.
    public static void divide(){
        int a=10;
        int b= 0;
        try {
            int c = a/b;          // EXCEPTION NOT HANDLED SO NECESSARY TO USE finally{}.
        }
        /*catch (Exception e){
            System.out.println(e);
        }*/
        finally {
            System.out.println("ALL EXCEPTION IS NOT HANDLED");
        }
    }

    public static void main(String[] args) {
        divide();
    }

}
