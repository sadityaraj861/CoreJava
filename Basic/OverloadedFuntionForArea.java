package Basic;
import java.math.*;

class AreaOf{
    public double Area(double r){
        return Math.PI*r*r;
    }

    public  double Area(int l,int b){
        return l*b;
    }

    public double Area(double b,float h){
        return 0.5*b*h;
    }
}
public class OverloadedFuntionForArea {

    public static void main(String[] args) {
        AreaOf a= new AreaOf();
        System.out.println("Area of circle is "+a.Area(3));
        System.out.println("Area of rect is "+a.Area(10,20));
        System.out.println("Area if Traingle is "+a.Area(10.1,9));

    }

}
