package NestedLoop;

public class Example {
    public static void main(String[] args) {

        for(int i=1;i<=6;i++){

            for(int j=1;j<=10;j++){
                System.out.print("("+i+","+j+") ");
            }
            System.out.println(""); // for moving into next line for the output of the nested loop.
        }
    }
}

 /*              we can clearly see that our  ( i DENOTES ROW)  & ( j DENOTES COLUMN).
                 ALL NESTED LOOP CREATES A BOX LIKE STRUCTURE IN THE FORM OF THE ROW & COLUMN.
                                                                                                     */