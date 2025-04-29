package Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element, will not be added
        
        System.out.println("HashSet: " + fruits); // Output order may vary
        
        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);
        
        System.out.println("Iterating through HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}



