package Encapsulation;
import java.lang.*;
import java.util.*;
class cylinder{
    private double radius;
    private double height;
    private double dimension;

    public double getRadius(){                        // GETTER METHOD FOR RADIUS
        return radius;
    }
    public double getHeight(){                         // GETTER METHOD FOR HEIGHT
        return height;
    }
    public void setRadius(double r){                  // SETTER METHOD FOR RADIUS
        if(r>=0)
            radius=r;
        else
            radius=-1;
    }

    public void setHeight(double h){                   //   SETTER METHOD FOR HEIGHT
        if(h>=0)
            height = h;
        else
            height = -1;
    }

    public void setDimension(double r,double h){     // overloading (FAST BUT NOT EFFICIENT DOESN'T CHECK -VE NUMBERS.
        radius = r;
        height = h;
    }


    public double volume(){                            // METHOD FOR VOLUME
        return (Math.PI*radius*radius*height);
    }

    public cylinder() {                                // DEFAULT CONSTRUCTOR
        radius = 1;
        height = 1;
    }

    public cylinder(double r){                           // SINGLE PARAMETERIZED CONSTRUCTOR
        setRadius(r);
    }
    public cylinder(double r,double h){                  // DOUBLE PARAMETERIZED CONSTRUCTOR
        setRadius(r);
        setHeight(h);
    }
}


public class cylinderStudentChallange {

    public static void main(String[] args) {
      // cylinder cr = new cylinder();
        cylinder cr = new cylinder(6,8);
     //   cr.setHeight(17.4);
     //   cr.setRadius(8.4);

      //  cr.setDimension(17.4,8.4);

        System.out.println("VOLUME IS "+cr.volume());
        System.out.println("GIVEN RADIUS IS "+cr.getRadius());
        System.out.println("GIVEN HEIGHT IS "+cr.getHeight());
        System.out.println(" ");
        System.out.println(" KEEP GRINDING BUDDY");
    }




}
