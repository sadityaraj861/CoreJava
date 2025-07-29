package Generic;

class MyArray<T>{
    public int length=0;

    T Arr[] = (T[]) new Object[10];
    public void append(T val){
        Arr[length++] =  val; // first val is inserted on Arr[length then increment]
    }

    public void Display(){
        for(int i=0;i<length;i++){
            System.out.println(Arr[i]);
        }
    }
}


public class GenericWildcard {

    static void fun(MyArray<?> obj){ //unbounded wildcard. ; ANYTYPE
        obj.Display();

    }

    public static void main(String[] args) {
        MyArray<String> ma1 = new MyArray<>();
        ma1.append("Aditya");
        ma1.append("Sachin");
        fun(ma1);


        MyArray<Integer> ma2 = new MyArray<>();
        ma2.append(1);
        ma2.append(4);
        fun(ma2);

    }
}
