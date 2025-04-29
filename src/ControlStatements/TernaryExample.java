package ControlStatements;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 20, num = 15;

        // Ternary operator to find the larger number
        String result1 = (a > b) ? "a is larger" : "b is larger";
        System.out.println(result1);  // Output: b is larger

        // Ternary operator with three conditions to categorize a number
        String result2 = (num > 0) ? (num < 10 ? "Single Digit" : (num < 20 ? "Teen" : "Adult")) : "Negative";
        System.out.println(result2);  // Output: Teen
    }
}
