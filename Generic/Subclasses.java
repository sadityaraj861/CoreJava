class  Arr<T>{
    T A[] =(T[]) new Object[10]; // OBJECT OF ARR[10] CREATED AND THEN TTYPE-CASTED INTO T[].BECAUSE WE CAN'T DIRECTLY
    // CREATE THE new T[10].

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

/*class MyArr extends Arr<String>{

// MyArr is extending from Arr  that is genericClass of String type , so MyArr Also behaves like String type.

}*/


class MyArr<T> extends Arr<T>{ // GENERIC ClaSs IS ALWAYS EXTENDS TO GENERIC CLASS.
    // MyArr extends from Arr of Type<T> so , MyArr also behaves like Generics of type T.
}

public class Subclasses {

    public static void main(String[] args) {

        MyArr<String> d = new MyArr<>(); //⭐⭐⭐⭐//we are not passing any parameter to our generic class , so it behaves like any object
        d.append("Ayush");
        d.append("Aditya");
      //  d.append(10);   Because it is integer. ,, if we remove the parameter then it behaves like an object and not trows error.


        d.display();
    }
}
