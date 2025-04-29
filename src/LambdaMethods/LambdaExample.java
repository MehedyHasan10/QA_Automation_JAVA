package LambdaMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> stringNumbers = Arrays.asList("2", "5", "11", "46", "32", "8", "13", "24", "39");

        //Convert list of strings to list of integers
        List<Integer> numbers = stringNumbers.stream()
                .map(Integer::parseInt) 
                .collect(Collectors.toList());

        // Calculate average value
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); 

        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);

        // Filter for odd numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);

        // Filter for even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Filter for numbers greater than average
        List<Integer> greaterThanAverage = numbers.stream()
                .filter(n -> n > average)
                .collect(Collectors.toList());
        System.out.println("Numbers Greater Than Average: " + greaterThanAverage);

        // Find minimum and maximum values
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        System.out.println("Minimum Value: " + min.orElse(null)); 
        System.out.println("Maximum Value: " + max.orElse(null)); 
    }
}
