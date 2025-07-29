package Encapsulation;
import java.math.*;

import static java.lang.Math.sqrt;

public class ENTER {

    private int age;
    private int score;

    public int getAge(){
        return age;
    }
    public int getScore(){
        return score;
    }

    public void setAge(int a){
        age=a;
    }
    public void setScore(int s){
        score= s;
    }

    public static void main(String[] args) {
        ENTER e1 = new ENTER();
        ENTER e2 = new ENTER();
        ENTER e3 = new ENTER();

        e1.setAge(8);
        e2.setAge(9);
        e3.setAge(10);

        System.out.println(e1.getAge());
        System.out.println(e2.getAge());
        System.out.println(e3.getAge());
        System.out.println(sqrt(9));
    }
}
