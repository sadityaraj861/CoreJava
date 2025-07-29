package Polymorphism;
class Superclass{
    public void display(){System.out.println("SUPER CLASS CALLED");}
}

class Subclass extends Superclass{
    public void display(){
        System.out.println("SUBCLASS CALLED");
    }

    public void show() {                                           // THIS IS THE EXTRA FEATURE OF SUBCLASS SO, WHEN WE TAKE REFERENCE
        System.out.println("EXTRA FEATURE OF SUBCLASS");          // OF SUPERCLASS WHILE OBJECT CREATION THIS METHOD HIDES. BECAUSE
    }                                                            // AT THAT TIME THE SUBCLASS IS CONSIDERED/REFERRED AS SUPERCLASS SO
}                                                               // NEW FEATURE ARE NOT CONSIDERED.


public class MethodOverRiding {
    public static void main(String[] args) {

        Superclass obj = new Superclass();      //SUPERCLASS CALLED.
        Superclass obj1 = new Subclass();       //SUBCLASS CALLED.    (CALLED DYNAMIC/RUNTIME METHOD DISPATCH.)
        Subclass obj2 = new Subclass();         //SUBCLASS CALLED

        obj.display();
        obj1.display();
        //  obj1.show();       SHOWS ERROR BECAUSE obj1 of SUBCLASS is created by taking the SUPERCLASS as a reference so new methods not allowed.
        obj2.display();
        obj2.show();
    }
}

