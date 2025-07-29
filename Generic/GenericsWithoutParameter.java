package Generic;
class Array1<T>{
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
public class GenericsWithoutParameter {
    /*
    If we remove the parameter from our Generics class :- IT CAN STORE VALUE OF ANY TYPE NO MATTER integer , String , float,etc
    THIS IS BECAUSE THEY ACT AS A OBJECT without parameter.
    IN ABOVE SUPER CLASS THAT'S WHY WE HAVE CREATED THE OBJECT OF Object class AND THEN TYPE CASTED IT IN TO T[].
     */
    public static void main(String[] args) {
        Array1 d = new Array1(); //⭐⭐⭐⭐//we are not passing any parameter to our generic class , so it behaves like any object
        d.append(10);
        d.append(20);
        d.append("Aditya");
        d.append(100.45);

        d.display();
    }
}

