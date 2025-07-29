package ClassAObject;
import java.util.*;
import java.lang.*;

class Television                                                 // CLASS TELEVISION CREATED
{
    private int channel;                                       // PROPERTIES//ATTRIBUTES
    private int volume;                                      // PROPERTIES//ATTRIBUTES

    public void changechannel()                              // METHODS  //BEHAVIOR
    {
        System.out.println(" channel changed");
    }
    public void changevolume(){                              // METHODS // BEHAVIOR
        System.out.println(" volume changed");
    }
}
 public class objectClasses
{
    public static void main(String[] args)
    {
        Television t=new Television();                      // OBJECT t OF CLASS TELEVISION IS CREATED
        t.changechannel();                                //CALLING METHOD  changechannel
        t.changevolume();                                 //CALLING METHOD  changevolume

        System.out.println(t instanceof Television);   //CHECKING INHERITANCE.
    }
}