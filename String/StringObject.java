package String;

public class StringObject {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        System.out.println("IS BOTH ARE THE SAME OBJECT : "+(str1==str2));// appears true because there is only 1 object that appears in the pool/stack;and str1 & str2 refers that same object .



        String str3 = "JAVA";  //creats object in pool
        String str4 = new String("JAVA");//create object in heap.
        System.out.println("IS BOTH ARE THE SAME OBJECT : "+(str3==str4)); //appears false because object are diffrent.

    }
}
