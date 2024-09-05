package Basic;

import java.util.Scanner;
class evenOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println(number % 2 == 0);
    }
}
