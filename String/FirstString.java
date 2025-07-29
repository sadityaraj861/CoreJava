package String;

public class FirstString{
    public static void main(String[] args) {

        System.out.print(" Aditya ");
        System.out.println("Hello world ");
        System.out.printf("The name is %3$s whose age is %1$d and current net worth is %2$.4f",19,1892.56789f,"Aditya");

        System.out.println();
        String s ="Aditya";

        System.out.println(s.matches("Aditya"));

        System.out.println(s.indexOf('A'));
        System.out.println(s.replaceAll("[aeiouAEIOU]",""));

        System.out.println(s+'A');
    }
}

