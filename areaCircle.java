package Basic;
import java.math.*;
import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius");
        double r = sc.nextDouble();

        double area = Math.PI*r*r;
        double perimeter =2*Math.PI*r;

        System.out.println("Area of circle is "+area);
        System.out.println("Perimeter of circle is "+perimeter);


    }
}
