package ControlStatements;

import java.util.Scanner;

public class If_Else_ElseIf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Any Number:");
        int number = input.nextInt();

        if (number > 10) {
            System.out.println("Number is greater than 10");
        } else if (number == 5) {
            System.out.println("Number is equal to 5");
        } else {
            System.out.println("Number is less than 5");
        }
    }
}
