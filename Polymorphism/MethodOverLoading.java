package Polymorphism;


class Sumation{
    int a ;
    int b;
    int c;
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Sumation s = new Sumation();
        System.out.println(s.sum(2,3));
        System.out.println(s.sum(2,3,4));
    }
}
