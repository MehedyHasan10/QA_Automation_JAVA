package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaStreamExample {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("2", "5", "11", "46", "8", "33", "27");

        //Convert list of strings to list of integers
        List<Integer> intList = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("List of Integers: " + intList);

        //Calculate the average value
        double average = intList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Average Value: " + average);

        //Filter for odd numbers
        List<Integer> oddNumbers = intList.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);

        //Filter for even numbers
        List<Integer> evenNumbers = intList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        //Filter for numbers greater than average value
        List<Integer> greaterThanAverage = intList.stream()
                .filter(n -> n > average)
                .collect(Collectors.toList());
        System.out.println("Numbers Greater Than Average: " + greaterThanAverage);

        //Find the minimum value
        int minValue = intList.stream()
                .min(Integer::compareTo)
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Minimum Value: " + minValue);

        // Find the maximum value
        int maxValue = intList.stream()
                .max(Integer::compareTo)
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Maximum Value: " + maxValue);
    }
}
