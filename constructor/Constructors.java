package constructor;
class Rectan{
    private int length;
    private int breadth;

    public Rectan(){
        length = 0;
        breadth = 0;
    }
// here in parameterized constructor it doesnot check our length wether it is -ve or not and directly assigns the value.
    // so we can increase our efficiency of program by using getter and setter inside our constructor method defination.
    public Rectan(int l,int b){
        length = l;
        breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


public class Constructors {
    public static void main(String[] args) {

      //  Rectan r = new Rectan(); // default constructor
        Rectan r = new Rectan(-8,3); // parametrized constructor.

        System.out.println(" given length : "+r.getLength());
        System.out.println(" given length : "+r.getBreadth());

    }
}
