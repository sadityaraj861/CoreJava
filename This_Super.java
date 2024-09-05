package Basic;
class Rectangle
{
    int length;
    int breadth;
    int x=10;

    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public int area(){
        return (length*breadth);
    }

}

class Cuboid extends Rectangle
{
    int height;
    int x=20;

    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }

    public int Volume(){
        return (length*breadth*height);    }


    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
        System.out.println("rectngle length: "+super.length);
        System.out.println("rectngle breadth : "+super.breadth);
        System.out.println("Area of rectangle is : "+super.area());
        System.out.println("volume of cubiid is : "+this.Volume());

    }
}


public class This_Super
{
    public static void main(String[] args)
    {
        Cuboid c=new Cuboid(10,5,15);
        c.display();
    }
}