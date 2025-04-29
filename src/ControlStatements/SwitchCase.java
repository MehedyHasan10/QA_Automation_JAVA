package ControlStatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
        
                System.out.print("Input Any Number 1 to 3: ");
                int number = input.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("Monday");
                        break;

                    case 2:
                        System.out.println("Tuesday");
                        break;

                    case 3:
                        System.out.println("Friday");
                        break;

                    default:
                        System.out.println("I don't know this day name yet");
                }
        }
    }
}

