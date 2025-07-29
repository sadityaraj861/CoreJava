package Array;
/* LEFT ROTATION */
public class RotationOfArray {
    public static void main(String[] args) {

        int a[] = {13,55,78,5,44,5,66,55,4,5,55,45};

        for(int x:a){
            System.out.print(x+",");
        }
        System.out.println("");

        int temp = a[0];

        for(int i=1;i<a.length;i++){
            a[i-1] = a[i];
        }
        a[a.length-1] =temp;

        for(int x:a){
            System.out.print(x+",");
        }
    }
}

/*
        13,55,78,5,44,5,66,55,4,5,55,45,
        55,78,5,44,5,66,55,4,5,55,45,13,
*/
