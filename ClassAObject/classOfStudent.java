package ClassAObject;
class student{
    public int roll;
    public String name,cources;
    public int m1,m2,m3;


    public int total(){
        return (m1+m2+m3);
    }

    public double average(){
        return((m1+m2+m3)/3);
    }

    public String grade(){
        if (((m1+m2+m3)/3)>69){
            System.out.println("GRADE IS A");
        } else if (60<((m1+m2+m3)/3) &&  (((m1+m2+m3)/3))<69) {
            System.out.println("GRADE IS B");
        }
         return null;
    }
}

public class classOfStudent {
    public static void main(String[] args) {
        student s1 = new student();

        s1.m1=70;
        s1.m2=79;
        s1.m3=61;
        System.out.println("TOTAL MARKS: "+s1.total());
        System.out.println("AVERAGE MARKS IS "+s1.average());
        System.out.println(" "+s1.grade());

    }
}
