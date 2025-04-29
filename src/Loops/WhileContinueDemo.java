package Loops;

import java.util.ArrayList;

public class WhileContinueDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        System.out.println("Fruits in the list (excluding 'Date'):");
        int index = 0; 
        while (index < fruits.size()) {
            String fruit = fruits.get(index); 
            
            if (fruit.equals("Date")) {
                index++; 
                continue; 
            }

            System.out.println(fruit); 
            index++;
        }
    }
}
