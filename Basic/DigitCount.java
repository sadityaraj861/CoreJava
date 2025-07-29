package Basic;
import java.math.*;

public class DigitCount {
    static int countDigit(int n){
        int count=(int)(Math.log10(n)+1);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(DigitCount.countDigit(101));
    }
}
