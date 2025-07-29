package Funtional_programmming_java;

public class CustomInterface {
    @FunctionalInterface
    interface MathOperation{
        int operate(int a , int b);
    }

    public static void main(String[] args) {
//        Function<int,int> add= a->a+a;
        MathOperation add= (a,b)->a + b;
        MathOperation sub = (a,b)->a-b;
        MathOperation mul = (a,b)->a*b;
        MathOperation div = (a,b)->a/b;

    }
}
