package Basic;

public class Student {

    private String name;
    private int age;

    public String status(){
        return "Student is Studying !!";
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public int getAge(){
        return age;
    }

    public String toString(){// helps in direct calling the object . means when ever we call obj toString method is called.
        return name+"\n"+age+"\n"+status();
    }

    public static void main(String[] args) {
        Student s= new Student();
        s.setName("Aditya");
        s.setAge(19);

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.status());

        System.out.println(s);
        
    }

}
