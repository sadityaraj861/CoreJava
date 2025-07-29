package TwoDArray;

public class Adding2Matrice {
    public static void main(String[] args) {

        int arr[][] ={{3,5,9},{7,6,2},{4,3,5}};
        int brr[][] = {{1,5,2},{6,8,4},{3,9,7}};
        int crr[][] =new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                crr[i][j] = arr[i][j] + brr[i][j] ;

            }
        }

        for(int i=0;i<crr.length;i++){

            for(int j=0;j<crr[i].length;j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
