package homeworkweek6;

import java.util.Scanner;

/**
 * Crated by Sandip Patel
 * Any radius value of the circle and find out the area
 * Formula of Area A=PI*r*r
 */
public class Programme6_RadiusValue {
    public static void main(String[] args) {
        double radius, area;// radius, area variable
        Scanner scanner = new Scanner(System.in); // scanner object
        System.out.println("Enter the radius of the circle"); // prompt the user to enter the radius
        radius = scanner.nextDouble(); // read the radius value from the user
        area = Math.PI * radius * radius;// formula
        System.out.println("Area of the Circle is " + area);//display the result
        scanner.close();// close scanner

    }
}
