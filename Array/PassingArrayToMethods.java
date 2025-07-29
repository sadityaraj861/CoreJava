package Array;

public class PassingArrayToMethods {
    public static void swap(int[] a){
        int temp=a[0];
        a[0]=a[1];
        a[1]=temp;
    }
    public static void main(String[] args) {
        int[] a={10,20};
        System.out.println(a[0]+" "+a[1]);
        swap(a); //pass by reference pass hoga.
        System.out.println(a[0]+" "+a[1]);
    }
}
