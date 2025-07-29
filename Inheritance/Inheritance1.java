package Inheritance;
import java.util.Scanner;
class Circle {
    public double radius;

    public double area() {

        return (Math.PI * radius * radius);
    }

    public double perimeter() {

        return (2 * Math.PI * radius);
    }

    public double circumference() {

        return perimeter();
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return (area()* height);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cylinder c2 = new Cylinder();
        c2.radius=8;
        c2.height=10;

        System.out.println("Area of circle is " + c2.area());
        System.out.println("Perimeter of circle is " + c2.perimeter());
        System.out.println("Volume of cylinder is " +c2.volume());
        System.out.println("given height is "+c2.height);

    }
}

