package Array;

public class SortingOfString {
    public static void main(String[] args) {

        String arr[] = {"java","python","pascal","adda","basic"};

        java.util.Arrays.sort(arr);

        for(String x: arr){
            System.out.println(x);
        }
    }
}
