package Funtional_programmming_java;

public class Immutibility {
    private final String name; //final makes our value immutable;
    private final int age;

    public Immutibility(String name,int age){
        this.name=name;
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    public static void main(String[] args) {
        Immutibility i=new Immutibility("Aditya",19);
        System.out.println("Age="+i.getAge());
        System.out.println("Name="+i.getName());
 //       i.name="priyansh";  returns error
        System.out.println(i.getName());
    }
}
