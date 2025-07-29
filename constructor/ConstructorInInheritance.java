package constructor;

import java.util.*;

class parent{
    public parent(){                                   //(4)
        System.out.println("PARENT CLASS CALLED");     //(5)
    }
}

class child extends parent{
    public child(){                                    //(3)
        System.out.println("CHILD CLASS CALLED");      //(6)
    }
}
class grandChild extends child{
    public grandChild(){                               //(2)
        System.out.println("GRANDCHILD CALLED");       //(7)
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {             //
        grandChild c1 = new grandChild();                // (1)
    }
}
