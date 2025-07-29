package ConditionalStatement;

import javax.swing.*;

public class RadixOfString {
    public static void main(String[] args) {

        String n1 = "1010110";
        String n2 = "12357";
        String n3 = "A25B";
        String n4 = "2589";

        /*   0-1 = binary number
             0-8 = octal number system
             0-F = hexadecimal number
             0-9 = decimal
         */


        if (n1.matches("[01]*")){
            System.out.println("N1 IS BINARY STRING");
        }
        else {
            System.out.println("N1 IS NOT A BINARY STRING ");
        }

        if(n2.matches("[0-8]*")){
            System.out.println("n2 is octal number system ");
        }
        else{
            System.out.println("n2 is not a octal number ");
        }

        if (n3.matches("[0-9A-F]*")){
            System.out.println("n3 is hexadecimal number system ");
        }
        else {
            System.out.println("n3 is not a hexadecimal");
        }

        if (n4.matches("[0-9]*")){
            System.out.println("n4 is decimal number system");
        }
        else{
            System.out.println("n4 is not a decimal number system ");
        }
    }
}
