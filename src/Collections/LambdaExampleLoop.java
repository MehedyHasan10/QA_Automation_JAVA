package Collections;

import java.util.Arrays;
import java.util.List;

public class LambdaExampleLoop {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
    }
}
