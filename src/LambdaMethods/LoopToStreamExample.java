package LambdaMethods;

import java.util.Arrays;
import java.util.List;

public class LoopToStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Traditional loop
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        // Using Streams and Lambdas (Query Expression)
        numbers.stream()
                .filter(n -> n % 2 == 0)  // Filter out even numbers
                .forEach(System.out::println);  // Print each even number
    }
}
