 package ConditionalStatement;

 import java.util.Scanner;

public class MenuDrivenArthemeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int a = sc.nextInt();
        System.out.println("Enter 2st number ");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.println(" Enter option in words for Arithemetic operation . like :- Add,Sub,Mul,Div");

        String option = sc.nextLine();

        switch(option){
            case "Add" :
                System.out.println("Add is "+(a+b));
                break;
            case "Sub" :
                System.out.println("Subtract is "+(a-b));
                break;
            case "Mul" :
                System.out.println("Multiplication is "+(a*b));
                break;
            case "Div" :
                System.out.println("Division  is "+(a/b));
                break;
            default :
                System.out.println("not a valid input ");
                break;
        }
    }
}
