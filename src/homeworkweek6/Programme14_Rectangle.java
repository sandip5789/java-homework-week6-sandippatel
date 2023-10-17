package homeworkweek6;

/**
 * created by Sandip Patel
 * Print the area and perimeter of a rectangle
 * concatination ia addition of two variable
 */

public class Programme14_Rectangle {
        public static void main(String[] args) {
            double width = 5.5;
            double height = 8.5;

            double area = width * height;
            double perimeter = 2 * (width + height);

            System.out.println("Area is " + width + " * " + height + " = " + String.format("%.2f", area));
            System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + String.format("%.2f", perimeter));
        }
    }








