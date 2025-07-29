package Methods;

public class updationOfArray {

    static void update(int arr[]){
        arr[0] = 25;
    }
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7,8};
        update(arr);


        System.out.println(arr[0]);

        for(int x:arr){
            System.out.print(x+",");
        }
    }
}
