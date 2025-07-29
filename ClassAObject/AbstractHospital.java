package ClassAObject;

abstract class hospital{
    public hospital(){
        System.out.println("HOSPITAL STANDARDS CONSTRUCTOR");
    }
    abstract void emergencyWard();
    abstract void Icu();
    abstract void admit();
    abstract void billing();
}

 class MyHospital extends hospital {
    @Override
    void emergencyWard(){
        System.out.println("EMERGENCY WARD PRESENT");
    }
    @Override
    void Icu(){
        System.out.println("ICU PRESENT");
    }
    @Override
    void admit(){
        System.out.println("ADMIT IS ALSO TAKEN 24*7");
    }
    @Override
    void billing(){
        System.out.println("PROPER BILLING IS DONE");
    }
}

public class AbstractHospital {
    public static void main(String[] args) {
        hospital H = new MyHospital();   // WHEN AN OBJECT IS CREATED OF INHERITED CLASS FIRST SUPER CLASS CONSTRUCTOR IS CALLED.
        H.admit();
        H.billing();
        H.Icu();
        H.emergencyWard();
    }
}
