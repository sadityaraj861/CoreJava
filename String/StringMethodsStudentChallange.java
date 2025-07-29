package String;

public class StringMethodsStudentChallange {
    public static void main(String[] args) {
        String s = "sadityaraj861@gmail.com";

        int i = s.indexOf("@");// uses indexOf() method of Sting class for getting the index of @.
        int j = s.length();

        String UserName = s.substring(0,i);
        String Domain = s.substring(i+1,j);

        System.out.println("UserName : "+UserName);

        System.out.println("Domain : "+Domain);

        System.out.println(Domain.startsWith("gmail"));
    }
}
