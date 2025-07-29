package String;

import java.sql.SQLOutput;

public class RegularExpressionStudentChallange {
    public static void main(String[] args) {

        // Q.)  FIND  IF A GIVEN NUMBER IS BINARY OR NOT ?

        int i = 100010101;
        String s =  String.valueOf(i);   // OR String s = i+"";       FOR CHANGING THE INT VALUE TO STRING .

        System.out.println("NO is binary or not : "+s.matches("[01]*"));


        //  Q.) FIND THE GIVEN NUMBER IS HEXA-DECIMAL OR NOT ? . [0-9][A-F]

        String s1 = "0123456789ABCDEF";
        System.out.println("NO is hexa-decimal or not : "+s1.matches("[0-9A-F]*"));

        // Q.) FIND THE DATE IS IN DATE FORMAT OR NOT ?

        String s2 = "30/11/2982";
        System.out.println("Date or not : "+s2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));


        //Q.) Remove special character form the string.

        String s3 = "a!B@c#d$1%2*3";
        s3 = s3.replaceAll("[^a-zA-Z0-9]*","");  //    \W for neither digit not alphabet
        System.out.println(s3);

        //Q.) Remove the extra spaces from String .

        String s4 = "   A   D I T Y A ";
        s4= s4.replaceAll("\\s","").trim(); //      \s for spaces
        System.out.println(s4);

        //Q.) Find the number of word in String .


        String S = "how to find no of word in a string";  // 9 WORD.
        String Words[] = S.split("\\s");
        System.out.println("no of words are : "+Words.length);
    }
}
