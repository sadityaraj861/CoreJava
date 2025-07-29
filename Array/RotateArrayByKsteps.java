package Array;

public class RotateArrayByKsteps {
    public static void reverse(int[] arr,int k){
        int i=0;
        int j=arr.length-1;
        int temp;

        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }


        //2ND TIME
        int a=0;
        int b=arr.length-k-1;
        int temp2;

        while(a<b){
            temp2=arr[a];
            arr[a]=arr[b];
            arr[b]=temp2;
            a++;
            b--;
        }

        //3RD TIME

        int e=arr.length-k;
        int f=arr.length-1;
        int temp3;

        while(e<f){
            temp3=arr[e];
            arr[e]=arr[f];
            arr[f]=temp3;
            e++;
            f--;
        }
    }
    public static void print(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,7,11,13,17};
        print(arr);
        System.out.println();

       reverse(arr,5);

       print(arr);
    }
}
