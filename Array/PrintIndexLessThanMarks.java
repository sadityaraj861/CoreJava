package Array;

public class PrintIndexLessThanMarks {
    public static void main(String[] args) {
        int[] marks ={100,95,85,21,17,71,36,35,7};
        int PassingMarks=35;

        for(int i=0;i<marks.length;i++){
            if(marks[i]<35) {
                System.out.println("Student whose marks on index " + i + " is failed with " + marks[i]);
            }
        }
    }
}
