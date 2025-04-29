package Loops;

public class ContinueDemo {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 4, 10, 9};
        
        for (int number : numbers) {
            if (number % 2 == 0) {  
                continue;  
            }
            System.out.println("Odd number: " + number);
        }
    }
}
