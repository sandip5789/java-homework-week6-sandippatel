package homeworkweek6;

import java.util.Scanner;

/**
 * created by Sandip Patel
 * decimal number to binary
 */

public class Programme17_DecimalBinary {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a Decimal Number: "); // Input a decimal number
            int decimalNumber = scanner.nextInt(); // read

            String binaryNumber = decimalToBinary(decimalNumber);// Convert to binary
            System.out.println("Binary number is: " + binaryNumber);// Output the result
            scanner.close();


        }
        public static String decimalToBinary(int decimal) {
            // Function to convert decimal to binary
            if (decimal == 0) {
                return "0";
            }

            StringBuilder binary = new StringBuilder();

            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder); // Prepend the remainder to the binary string
                decimal = decimal / 2;
            }

            return binary.toString();
        }

    }



