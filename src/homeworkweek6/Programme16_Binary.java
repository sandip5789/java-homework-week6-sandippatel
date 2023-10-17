package homeworkweek6;

import java.util.Scanner;

/**
 * created by Sandip Patel
 * Binary numbers
 */

public class Programme16_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        String binary1 = scanner.nextLine(); // read first binary as a string

        System.out.println("Input second binary number: ");
        String binary2 = scanner.nextLine(); // read second binary as a string

        int num1 = Integer.parseInt(binary1,2);  // convert binary into integers
        int num2 = Integer.parseInt(binary2,2); // convert binary into integers
        int sum = num1 + num2; // add both integers
        String binarySum = Integer.toBinaryString(sum); // result convert back to binary
        System.out.println("Result: " + binarySum); //result display
        scanner.close();

    }


}
