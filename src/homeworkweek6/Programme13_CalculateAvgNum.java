package homeworkweek6;

import java.util.Scanner;
/**
 * Created by Sandip Patel
 */
public class Programme13_CalculateAvgNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first number: "); // user to enter
        double number1 = scanner.nextDouble(); // for read
        System.out.println("Insert the second number: "); // user to enter
        double number2 = scanner.nextDouble();// for read
        System.out.println("Insert the third number: "); // user to enter
        double number3 = scanner.nextDouble();// for read
        double average = (number1 + number2 + number3) / 3;// calculate avg.
        System.out.println("The average of the number is: " + average); // user to read
        scanner.close(); // close scanner always to free up resources *
    }
}
