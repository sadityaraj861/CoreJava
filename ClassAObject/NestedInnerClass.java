package ClassAObject;
class outer{
     int x= 10;    // STATIC AND INSTANCE VARIABLE
    inner i = new inner();
    class inner{
        int y=20;
       public void innerDisplay(){
            System.out.println("LOCAL VARIABLE OF INNER CLASS "+y);
            System.out.println("INSTANCE VARIABLE OF OUTER CLASS "+x);
       }
    }
    public void OuterDisplay(){
        i.innerDisplay();
    }

}

public class NestedInnerClass {
    public static void main(String[] args) {
        outer o = new outer();
        o.OuterDisplay();
        outer.inner oi = new outer().new inner ();
        oi.innerDisplay();
    }
}
