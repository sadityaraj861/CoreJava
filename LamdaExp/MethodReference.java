package LamdaExp;

@FunctionalInterface
interface Mylambda1{
    public int display(String str1,String str2);
}



public class MethodReference {

    public static void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }


    public static void main(String[] args) {
        /*
        * System: class
        * out: object
        * println: non static method
        */

        /*
        Mylambda1 ml=System.out::println;
        ml.display("Aditya hello");
        */
        //Mylambda1 ml=MethodReference::reverse;
        Mylambda1 ml = String::compareTo;
        System.out.println(ml.display("zello","well"));//makes display method as reverse method.

    }
}
