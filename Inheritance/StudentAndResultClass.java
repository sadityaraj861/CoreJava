package Inheritance;


class Student{
    String name;
    int SID;

    public Student(){
        this.name=null;
        this.SID=0;
    }
    public Student(String n,int ID){
        name=n;
        SID=ID;
    }

}
class result extends Student{
    int marks1;
    int marks2;
    int marks3;


    public result(int m1,int m2,int m3){
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }

    public double PercMarks(){
        return (((marks1+marks2+marks3)/3));
    }
}

public class StudentAndResultClass {
    public static void main(String[] args) {
        Student s1= new Student("Aditya",20);
        result r = new result(80,90,95);
        System.out.println("Student name: "+r.name);
        System.out.println("Student ID: "+r.SID);

        System.out.println("percentage marks:"+r.PercMarks()+'%');

    }
}
