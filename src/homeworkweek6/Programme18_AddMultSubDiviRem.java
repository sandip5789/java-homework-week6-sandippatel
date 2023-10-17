package homeworkweek6;

import java.util.Scanner;

/**
 * Created by Sandip Patel
 * calculation
 */

public class Programme18_AddMultSubDiviRem {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input first number: ");
            int num1 = in.nextInt();
            System.out.print("Input second number: ");
            int num2 = in.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // addition
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // subtrarct
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2)); // multiply
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // divide
            System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2)); // remainder of two numbers
        }
    }




