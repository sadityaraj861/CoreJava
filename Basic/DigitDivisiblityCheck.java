package Basic;

public class DigitDivisiblityCheck {
    public static int countDigits(int n){
        // Write your code here.
        int org=n;
        int count=0;
        int last;

        while(n>0){
            last=n%10;
            if(last!=0 && org%last==0){
                count++;
            }
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=660;
        System.out.println("no of digits divides "+n+" is "+countDigits(n));

    }

}
