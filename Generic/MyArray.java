
//we can't create the array of type generic ; T Arr[] = new Arr[10]  WRONG❌❌
public class MyArray<T> {
    T Arr[] = (T[]) new Object[10]; // we created the 10 object of Arr and then type casted in Generic.

    public int length=0;

    public void append(T val){
        Arr[length++] =  val; // first val is inserted on Arr[length then increment]
    }

    public void Display(){
        for(int i=0;i<length;i++){
            System.out.println(Arr[i]);
        }
    }

    public void Show(){
        for(T x:Arr){// for each x in Arr of type T.
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        MyArray<Integer> Array = new MyArray<>(); // Here we create an array if integer , we can also create of String type.
        Array.append(10);
        Array.append(20);
        Array.append(30);
        Array.append(40);
        Array.append(50);

        Array.Show();
    }
}
