package Funtional_programmming_java;

import java.util.*;
import java.util.function.*;

public class UnderstandLambda {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //External iterator.
        for(int x:numbers){
            System.out.println(x);
        }

        //internal iterator.
        /* instead of creating an anonyumus inner class we can use lambda.
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer e) {
                System.out.println(e);
            }
        });
        */
        //lambda
        numbers.forEach(( e)-> System.out.println(e));
        //OR Method reference.
        numbers.forEach(System.out::println);


        //Q.) find the total of double of even numbers.

        //dirty code more line,more no of mutibility
        //what to do how to do (IMPERATIVE_STYLE).
        int result=0;
        for(int x: numbers){
            if(x%2 ==0){
                result +=x*2;
            }
        }
        System.out.println(result);

        //Beautiful code 1 line. NOT MUTATING
        //WHAT TO DO (DECLARATIVE_STYLE).
        System.out.println(numbers.stream()
                .filter(x-> x%2==0)
                .mapToInt(e->e*2)
                .sum());


        //get the sum of the square root of even numbers.

        System.out.println(numbers.stream()
                .filter(e-> e%2 == 0)
                .mapToDouble(Math::sqrt)
                .sum());

    }
}
