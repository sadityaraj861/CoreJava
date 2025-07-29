package String;

public class StringMatches {
    public static void main(String[] args) {
        String s = "%";
        System.out.println(s.matches("."));

        String s1 = "Aa";
        System.out.println(s1.matches("[A-Z][a-z]"));

        String s2 = "%";
        System.out.println(s2.matches("[^abc]")); // any single character except [abc].

        String s3 = "999";
        System.out.println(s3.matches("[0-9][0-9][0-9]"));

        System.out.println(s.matches("\\W")); //Neigther digit nor alphabet


        String S = "abcsdd";
        System.out.println(S.matches("[a-z]+")); // a  TO  z one or more letter.

        String S1 = "@##%%^*(&(*)";
        System.out.println(S1.matches(".*"));  // returns for every Expression.


        String S2 = "adityaaaaaa";//  111 digits.
        System.out.println(S2.matches("[a-z]{1,11}"));

        String S3 = "sadityaraj861@gmail.com";
        System.out.println(S3.matches(".*@gmail.*"));


    }
}
