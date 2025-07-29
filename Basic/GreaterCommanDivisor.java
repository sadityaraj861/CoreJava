package Basic;
import java.math.*;
public class GreaterCommanDivisor {
    public static int gcd(int n1,int n2){
        //BETTER APPROACH;

        /*int gcd=0;
        for(int i=Math.max(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0) {
                return i;
            }
        }
        return 1;*/

        //OPTIMAL APPROACH;
        //BY EUCLIDEAN ALGO.

        if(n1==0)
            return n2;
        if(n2==0)
            return n1;

        if(n1==n2)
            return n1;

        if(n1>n2){
            return gcd(n1-n2,n2);
        }else return gcd(n2-n1,n1);
    }
    public static void main(String[] args) {
        System.out.println(gcd(10,5));
    }
}
