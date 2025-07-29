package TwoDArray;

import java.sql.SQLOutput;

public class PracticingTwoDArray {
    public static void main(String[] args) {
        int a[][] = new int[5][5];

        int b[][] = {{1,2,3},{2,4,5},{6,7,8}};
        //two d array of 3-3.

//FOR LOOP
        for(int i=0;i<b.length;i++){

            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();
//FOR EACH LOOP
        for(int x[]: b){        // MEANS FOR EACH x[] in b.
            for(int y: x){        //MEANS FOR EACH Y IN X.
                System.out.print(y+" ");
            }
            System.out.println();
        }

        /*

        int[] e,f[];
        e = new int[2];//e is one d array
        f = new int[2][4];//f is 2d array

        */
    }
}
