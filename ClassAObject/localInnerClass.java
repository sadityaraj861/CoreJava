package ClassAObject;
class Outer{
    void Display() {
        class inner {  // HERE INNER CLASS IS ONLY LOCAL TO DISPLAY METHOD TO ONLY ACCESSIBLE INSIDE THE DISPLAY METHOD.

            void innerDisplay() {
                System.out.println("LOCAL INNER CLASS TO Display.");
            }
        }
        inner i = new inner();
        i.innerDisplay();
    }
}

public class localInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Display();
    }
}
