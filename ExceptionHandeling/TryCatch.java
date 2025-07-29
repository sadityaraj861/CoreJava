package ExceptionHandeling;
import java.util.*;

public class TryCatch {
    public static void main(String[] agrs){
        try{                               //The "try" keyword is used to specify a block where we should place an exception code.
            int[] A = {10,0,8,3,9};        //The try block must be followed by either catch or finally

            try{
                int r = A[0]/A[1];
                System.out.println(r); //throw ArithmeticException
            }
            catch(ArithmeticException e) {
                System.out.println(e);   //e AUTOMATIC PROVIDES WHAT's THE ERROR.
            }

            System.out.println(A[10]); //throw ArrayIndexOutOfBoundsException.
        }

        catch (Exception e){//The "catch" block is used to handle the exception
            System.out.println(e); //we can't use catch block alone , IT MUST FOLLOW (TRY).
        }
        System.out.println("BYE!!");


    }
}
