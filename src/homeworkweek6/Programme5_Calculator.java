package homeworkweek6;
/**
 * created by Sandip Patel
 * Calculator
 * concatination ia addition of two variable
 */

import java.util.Scanner;

public class Programme5_Calculator {
    // static method for addition
    static int answer, a, b;

    public static void addition(int x, int y) {
        int answer = x + y;
        System.out.println("Addition =: " + answer);
    }

    // static method for subtraction
    public static void subtraction(int x, int y) {
        int answer = x - y;
        System.out.println("Subtraction =: " + answer);
    }

    // Instance method for multiplication
    public void multiplication(int x, int y) {
        int answer = x * y;
        System.out.println("Multiplication =: " + answer);
    }

    // Instance method for division
    public void division(float x, float y) {
        float answer = x / y;
        System.out.println("Division =: " + answer);
    }

    public static void main(String[] args) {
        /// int a, b, answer
        Programme5_Calculator obj = new Programme5_Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        a = scanner.nextInt();
        System.out.println("Please enter second number");
        b = scanner.nextInt();
        addition(a, b);
        subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
        scanner.close();


    }
}
