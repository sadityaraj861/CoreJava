package TwoDArray;

public class JaggedArray {
    public static void main(String[] args) {
        int arr[][];
        arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];

        //FOR LOOP
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){  // here we written arr[i] because in jagged array we have different sizes in each cell.
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println();
//FOR EACH LOOP
        for(int x[]:arr){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}

