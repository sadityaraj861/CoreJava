package Encapsulation;

public class Employe {
    private String name;
    private int EID,salary;

    public void setName(String n){
        name=n;
    }
    public void setEID(int id){
        EID=id;
    }
    public void setSalary(int sal){
        salary=sal;
    }

    public String getName(){
        return name;
    }
    public int getEID(){
        return EID;
    }
    public int getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        Employe e= new Employe();
        e.setName("Aditya Singh");
        e.setEID(1);
        e.setSalary(100000);

        System.out.println("EName: "+e.getName());
        System.out.println("Eid: "+e.getEID());
        System.out.println("Esalary: "+e.getSalary());

    }
}
