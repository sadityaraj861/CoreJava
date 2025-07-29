package Polymorphism;

class shape{

    public void getArea(){
        System.out.println("Area is not mentioned");
    }
 
}
class rect extends shape{
    @Override
    public void getArea(){
        System.out.println("area of rect is : length*breadth");
    }
}

class circle extends shape{
    @Override
    public void getArea(){ System.out.println("area of circle is : PI*r*r"); }
}

class triangle extends shape{
    @Override
    public void getArea(){
        System.out.println("area of traingle is : 0.5*base*height");
    }
}
public class PolymorphismShapeClass {
    public static void main(String[] args) {
        shape s = new shape();
        rect r= new rect();
        circle c = new circle();
        triangle t= new triangle();

        s.getArea();
        r.getArea();
        c.getArea();
        t.getArea();
    }
}
