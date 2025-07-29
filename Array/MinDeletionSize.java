package Array;

public class MinDeletionSize {
    public static int minDeletionSize(String[] strs) {
        // Get the number of rows and columns
        int rows = strs.length;
        int cols = strs[0].length();

        int deletions = 0;

        // Iterate through each column
        for (int col = 0; col < cols; col++) {
            for (int row = 1; row < rows; row++) {
                // If the current column causes unsorted order, delete it
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    deletions++;
                    break;
                }
            }
        }

        return deletions;
    }

    public static void main(String[] args) {

        String[] strs1 = {"abcdef", "uvwxyz"};
        System.out.println(minDeletionSize(strs1)); // Output: 0


        String[] strs2 = {"zyx", "wvu", "tsr"};
        System.out.println(minDeletionSize(strs2)); // Output: 3


        String[] strs3 = {"ca", "bb", "ac"};
        System.out.println(minDeletionSize(strs3)); // Output: 1
        
    }
}

