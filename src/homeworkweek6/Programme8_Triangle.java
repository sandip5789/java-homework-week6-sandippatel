package homeworkweek6;

import java.util.Scanner;

/**
 * Created by Sandip Patel
 * calculate the area of a triangle
 * formula for area = (base * height) / 2
 */

public class Programme8_Triangle {
    public static void main(String[] args) {
        int base = 0;
        int height = 0;
        int area = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenght of base of triangle: ");
        base = scanner.nextInt();
        System.out.println("Enter the lenght of height of triangle");
        height = scanner.nextInt();
        // area = (base * height) / 2
        area = (base * height) / 2; // formula
        System.out.println("Area of the Triangle is: " + area);
        scanner.close();
    }
}
