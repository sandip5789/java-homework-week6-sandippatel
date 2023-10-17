package homeworkweek6;

import java.util.Scanner;

/**
 * Created by Sandip Patel
 * insert temperature value in degree F and convert to degree C
 * formula (F − 32) × 5/9 = 0°C
 */

public class Programme7_Celsius {
    public static void main(String[] args) {

        double F, C; // variables are f and c
        Scanner scanner = new Scanner(System.in); // scanner object
        System.out.println("Insert temperature in Fahrenheit: "); // prompt the user to enter the faherenheit
        F = scanner.nextDouble();// read the faherenheit  from the user
        C = (F - 32) * 5 / 9; // formula
        System.out.println("Temperature in Celsius: " + C + "°C"); // display the result c is celsius
        scanner.close();
    }
}
