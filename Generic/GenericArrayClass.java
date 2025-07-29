package Generic;
class Array<T>{
    T A[] =(T[]) new Object[10];

    int length = 0;
    public void append(T v){
        A[length++] = v;
    }
    public void display(){
        for(int i = 0 ;i<length;i++){
            System.out.println(A[i]);
        }
    }

}
public class GenericArrayClass {
    public static void main(String[] args) {
        Array<Integer> d = new Array<>(); // d instance of Generics class is  created.
        d.append(10);
        d.append(20);


        d.display();
    }
}
