package Loops;
import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        String InWords = "";

        int r ;

        while(n>0){
            r = n%10;
            n = n/10;
            InWords += r; //concatination inside loop. ; we can also reverse number using concatination.
        }
        System.out.println(InWords);
        char c ;

        for(int i = InWords.length()-1;i>=0;i--){
            c = InWords.charAt(i);

            switch(c){
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eighth ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
                default:
                    System.out.println("**not valid input**");
                    break;
            }
        }
    }
}
