package constructor;
class Recta{
    private int length;
    private int breadth;

    public Recta(){
        length = 0;
        breadth = 0;
    }

    public Recta(int l,int b){        // @OVERLOADING
        setLength(l);                 // calls setter method i.e getLength().
        setBreadth(b);                // calls setter method i.e getBreadth().
    }

    public void setLength(int l){      //SETTER METHOD FOR LENGTH.
        if(l>=0)
            length=l;
        else
            length=0;                  //MAKES BREADTH = 0; WHEN -VE VALUE GIVEN
    }

    public void setBreadth(int b){      // SETTER METHOD FOR BREADTH.
        if(b>=0)
            breadth=b;
        else
            breadth=0;                  // MAKES BREADTH = 0; WHEN -VE VALUE GIVEN
    }

    public int getLength() {            //GETTER METHOD FOR LENGTH.
        return length;
    }

    public int getBreadth() {           //GETTER METHOD FOR BREADTH.
        return breadth;
    }

}


public class constructorGetterSetter {
    public static void main(String[] args) {

        //  Recta r = new Recta(); // default constructor
        Recta r = new Recta(-8,3); // parametrized constructor.

        System.out.println(" given length : "+r.getLength());
        System.out.println(" given Breadth : "+r.getBreadth());

    }
}
