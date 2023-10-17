package homeworkweek6;
/**
 * Created by Sandip Patel
 */

public class Programme15_SwapTwoVariable {
    public static void main (String[] args) {

        // declare variables
        int x = 20;
        int y = 10;
        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // swap the value of x and y using a temporary varriable
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
