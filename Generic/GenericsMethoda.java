package Generic;

public class GenericsMethoda {

    static <E> void show(E[] Array){
        for(E x:Array){
            System.out.print(x+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        show(new String[]{"hii","go","Bye"});
        show(new Integer[]{1,3,55,5,6,6,6});

//OR
        String[] StArr = {"hii","go","Bye"};
        Integer[] IntArr = {1,3,55,5,6,6,6};
        show(StArr);
        show(IntArr);
    }
}
