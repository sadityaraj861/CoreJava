package Methods;

public class Maxof2 {

    //MAX METHOD IS MADE BEACAUSE IT IS CALLED FROM THE MAIN METHOD WHICH IS STATIC. SO. IT MUST BE STATIC...
    static int max(int x,int y){ //formal parameter
        if (x>=y){
            return x;
        }
        else
            return y;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int c = max(a,b); //ACTUAL PARAMETER.

        System.out.println("the maximum of both value is "+c);

    }
}
