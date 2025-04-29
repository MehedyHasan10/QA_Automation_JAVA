package Loops;

public class BreakDemo {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 4, 10, 9};
        
        for (int number : numbers) {
            if (number % 2 == 0) {  // If the number is even
                System.out.println("First even number found: " + number);
                break; 
            }
        }
        System.out.println("Loop finished.");
    }
}