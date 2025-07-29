package Array;

public class SecondMaximumElement {
    public static void main(String[] args) {
        int arr[] = {3,9,7,8,12,6,15,5,4,10};
        int max1 = 0;
        int max2 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max2 = arr[i];
            }
        }
        System.out.println("the SECOND max value inside the array is "+max2);
    }
}

/* CONCEPT
yaha pe 2 variable liye ek max and ek max2 , jab bhi koi bada element milta hai max se to max ka value change krne se phle hum
max2 ka value change krke max ke equal kr dete hai.
*/
