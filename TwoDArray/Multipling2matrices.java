package TwoDArray;

public class Multipling2matrices {
    public static void main(String[] args) {

        int arr[][] ={{3,5,9},{7,6,2},{4,3,5}};
        int brr[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int crr[][] =new int[3][3];

//  FOR MULTIPLICATION OF MATRICES WE MUST HAVE THE 2 SAME SIZE ARRAY.

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){

                    crr[i][j] = ( arr[i][k]*brr[k][j] );
                }
            }
        }

        for(int x[] :crr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
