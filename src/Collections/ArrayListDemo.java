package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println("Initial List:");
        for (int x : number) {
            System.out.println(" " + x);
        }
        
        // Remove an element from the list
        number.remove(1);
        System.out.println("\nAfter removing element at index 1:");
        for (int x : number) {
            System.out.println(" " + x);
        }

        // Replace an element
        number.set(2, 50);
        System.out.println("\nAfter replacing element at index 2 with 50:");
        for (int x : number) {
            System.out.println(" " + x);
        }
        
        number.clear();
        System.out.println("\nAfter clearing the list:");
        System.out.println(" " + number); 
    }
}
