package Funtional_programmming_java;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
