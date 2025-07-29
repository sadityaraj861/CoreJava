package Interface;
interface test{
    public void meth1();
    public void meth2();
}

class my implements test{
    @Override
    public void meth1() {
        System.out.println("METH1 OF CLASS MY ");
    }

    @Override
    public void meth2() {
        System.out.println("METH2 OF CLASS MY");
    }

    public void meth3(){
        System.out.println("NEW EXTRA METHOD OF CLASS MY");   // IT CAN'T BE ACCESS BY USING THE OBJECT WHICH MADE WITH THE REFERENCE OF INTERFACE TEST
    }
}

public class Interface1 {
    public static void main(String[] args) {
        my m = new my();
        m.meth1();
        m.meth2();
        //  m.meth3();       valid when we made the object of MY by referencing MY.
    }
}
