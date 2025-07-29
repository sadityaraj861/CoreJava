package ConditionalStatement;

import java.util.Scanner;

public class SwitchExampleWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the website");
        String url = sc.nextLine();

        int DotFromLast = url.lastIndexOf('.');
        int length = url.length();

        String ext = url.substring(DotFromLast,length);

        switch(ext){

            case ".com" :
                System.out.println("Commercial");
                break;
            case ".gov" :
                System.out.println("government");
                break;
            case ".org" :
                System.out.println("organization");
                break;
            default:
                System.out.println("not from the listed extension");
        }

    }
}
