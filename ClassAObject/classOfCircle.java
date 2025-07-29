package ClassAObject;
class circle{
    public double radius;    // attribute or property of class circle

    public double area(){     // method or behavior of class circle
        return (Math.PI*radius*radius);
    }

    public double perimeter(){    // method or behavior of class circle
        return (2*Math.PI*radius);
    }
}

public class classOfCircle{

    public static void main(String[] args) {

        circle rc1 = new circle();         // rc1 object created.
        rc1.radius=7;
        circle rc2 = new circle();         // rc2 object created.
        rc2.radius=12;

        System.out.println("Area1 is "+rc1.area()); // area method is called with rc1.
        System.out.println("Area2 is "+rc2.area()); // area method is called with rc2.

        System.out.println(" ");

        System.out.println("perimeter1 is "+rc1.perimeter());  // perimeter method is called with rc1.
        System.out.println("perimeter2 is "+rc2.perimeter());  // perimeter method is called with rc2.
    }
}