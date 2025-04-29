package LambdaMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsAndLambdas {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("appple", "banana", "kiwi", "fig", "date");
        
        List<String> result = words.stream()
                .filter(word -> word.length() > 3)  
                .map(String::toUpperCase)  
                .collect(Collectors.toList());  

        System.out.println(result);  
    }
}
