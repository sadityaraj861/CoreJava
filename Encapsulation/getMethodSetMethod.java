package Encapsulation;

import java.lang.*;

class Rect{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }
    public double getBreadth(){

        return breadth;
    }

    public void setLength(double l){
        if(l>0)
            length=l;
        else
            length=-1;
    }

    public void setBreadth(double b){
        if(b>0)
            breadth=b;
        else
            breadth=-1;
    }

    public double area(){
        return (length*breadth);
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
}

public class getMethodSetMethod {


    public static void main(String[] args) {
        Rect r = new Rect();
        r.setLength(9.5);
        r.setBreadth(12.6);

        System.out.println("AREA : "+r.area());
        System.out.println("PERIMETER : "+r.perimeter());

        System.out.println("GIVEN LENGTH IS "+r.getLength());
        System.out.println("GIVEN BREADTH IS "+r.getBreadth());
    }
}

