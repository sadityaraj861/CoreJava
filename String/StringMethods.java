package String;

public class StringMethods {
    public static void main(String[] args) {
        String s = " HelloWorld ";
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = new String("java");

        String s5 ="abcd";

        System.out.println(s1.equals(s2)); // equals checks the reference of the object not the value.
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s.length());
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());

        s = s.concat(" Said by Aditya !!");
        System.out.println(s);
        System.out.println(s.length());

        s= s.replace('o','a');
        System.out.println(s);

        for(int i=0;i<4;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(s5.substring(i,j)+" ");
            }
        }

    }
}
