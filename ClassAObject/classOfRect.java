package ClassAObject;

import java.util.*;
import java.lang.*;

class rectangle{

    double l,b;

    public double area(){
        return l*b ;
    }

    public double perimeter(){
        return (2*(l+b));
    }
}

public class classOfRect {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        rectangle rc1= new rectangle();

        System.out.println(" enter length");
        rc1.l=sc.nextDouble();
        System.out.println(" enter breadth");
        rc1.b=sc.nextDouble();


        System.out.println("Area is "+rc1.area());
        System.out.println("Perimeter is "+rc1.perimeter());



    }
}
