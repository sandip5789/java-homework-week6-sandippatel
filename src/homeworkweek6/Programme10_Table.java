package homeworkweek6;

import java.util.Scanner;

/**
 * created by Sandip Patel
 * Multiplication table
 */

public class Programme10_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); // only print beacuse need in line // user to read
        int number = scanner.nextInt();
        System.out.println("Multiplication Table for " + number + ":");//
        for (int i = 1; i <= 10; i++){
            int resuluts = number * i;
            System.out.println(number + " x " + i + " = " + resuluts); // diplay results

        }
        scanner.close();
    }
}
