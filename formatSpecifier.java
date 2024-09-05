package Basic;
public class formatSpecifier {
    public static void main(String[] args) {

        int a = 10;
        float b= 12.34f;
        char c ='a';
        String str = " Aditya ";

        System.out.printf("value of a is %d , b is %f and c is %c , and value of str is %s",a,b,c,str);

        System.out.printf("\n");

        System.out.println("value of a is "+a+" , value of b is "+b+" ,and value of c is "+c+" , and value of str is "+str);

        System.out.printf("%3$s %2$f %1$d",a,b,str);  // (3$) is argument 3 TEll us order of printing the number in order we want.
    }                                               // it is independent for order we have written our variable outside string .
}
