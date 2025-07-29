package CollectionFramework;

import java.util.*;

// we have to implement the comparable interface wen ever we are going to use the sortedset or tree set.
class point implements Comparable {
    int x;
    int y;

    public String toString(){
        return "x="+x+" y="+y;
    }

    public point(int x,int y){
        this.x=x;
        this.y=y;
    }

 //   compareTo methods returns : a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
    public int compareTo(Object o){ // parameter type should be object.

        point p = (point)o; //typecasting.

        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else{// when this.x = p.x
            if(this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else
                return 0;
        }
    }




}

public class ComparableInterface {
    public static void main(String[] args) {

        TreeSet<point> ts = new TreeSet<>();

        ts.add(new point(1,1));
        ts.add(new point(5,5));
        ts.add(new point(5,2));

        System.out.println(ts);



    }
}
