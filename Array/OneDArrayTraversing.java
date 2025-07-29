package Array;

public class OneDArrayTraversing {
    public static void main(String[] args) {

        //Different methods of declaration array
        int arr[] = new int[6];
        int b[] = {1,2,3,4,5,6};

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+",");
        }

        System.out.println("");

        for(int x:b ){ // means for each x in b.
            System.out.print(x+",");
        }
    }
}
