package Array;

public class CopyingAnArray {
    public static void main(String[] args) {

        int arr[]={8,6,10,9,2,15,7,13,14,11};
        int brr[]= new int[10];

        for(int x :arr){
            System.out.print(x+",");
        }
        System.out.println("");

        for(int i=0;i<10;i++){
            brr[i]=arr[i];
        }

        for(int x :brr){
            System.out.print(x+",");
        }
    }
}
