package Array;

public class SecLarElem {
    public static void main(String[] args) {

        int[] arr={34,45,-24,765,35,232,56,23,765,1,67,90};

        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max) max=arr[i];
        }
        int Smax=arr[0];

        for(int i=0;i< arr.length;i++){
            if(arr[i]>=Smax && arr[i]<max){
                Smax=arr[i];
            }
        }
        System.out.println(Smax);
    }
}
