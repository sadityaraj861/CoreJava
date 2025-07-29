package Basic;

import java.util.*;


public class TwoDMatrixSearch {
    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static boolean isMatch(int[][] matrix,int targetedNumber){
        boolean flag=false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(matrix[i][j]==targetedNumber){
                    flag=true;
                }else flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter  matrix["+i+","+j+"]");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter targeted number: ");
        int targetedNumber=sc.nextInt();

        for (int[] row : matrix) {
            bubbleSortDescending(row);
        }

        System.out.println("Matrix after sorting rows in descending order:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("is targeted element matched in matrix: "+TwoDMatrixSearch.isMatch(matrix,targetedNumber));


    }
}
