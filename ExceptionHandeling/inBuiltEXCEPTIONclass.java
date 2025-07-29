package ExceptionHandeling;
class NegativeDimentionException extends Exception{   // user DEFINED EXCEPTION CLASS.

    public String toString(){                        // OVER RIDING toString().
        return "DIMENSION CANNOT BE NEGATIVE";
    }

}

public class inBuiltEXCEPTIONclass {

    static int areaRectangle(int a,int b) throws NegativeDimentionException{
        if(a<0 || b<0){
            throw new NegativeDimentionException();
        }
        return (a*b);

    }
    static void meth1() throws NegativeDimentionException{
        System.out.println("AREA OF RECTANGLE IS : "+areaRectangle(-10,5));
    }


    public static void main(String[] args) throws NegativeDimentionException{

       try{
           meth1();
       }
       catch (NegativeDimentionException e){
           System.out.println(e);
       }
    }

}
