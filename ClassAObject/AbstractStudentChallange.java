package ClassAObject;

abstract class shape{
    abstract public double area();
    abstract public double perimeter();
}

class circlee extends shape{
     public double r;
    public double area(){
        return (Math.PI*r*r);
    }

    @Override
    public double perimeter() {
        return (2*Math.PI*r);
    }
}

class rectanglee extends shape{
   public double l;
   public double b;

    @Override
    public double perimeter() {
        return (2*(l+b));
    }

    @Override
    public double area() {
        return (l*b);
    }
}
public class AbstractStudentChallange {
    public static void main(String[] args) {
        circlee c = new circlee();
        rectanglee R = new rectanglee();
        c.r=8;
        R.l=9;
        R.b=3;

        System.out.println("AREA of circle is "+c.area());
        System.out.println("perimeter of circle is "+c.perimeter());
        System.out.println("area of rect is "+R.area());
        System.out.println("perimeter of rect is "+R.perimeter());
    }
}
