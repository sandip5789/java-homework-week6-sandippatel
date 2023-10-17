package homeworkweek6;

/**
 * Created by Sandip Patel
 * Static method
 */
public class Programme2 {
    static int a = 20; // a is a static variable
    static String name = "Cricket Worldcup"; // name is a static variable

    // declare static method
    // m2 is static
    public static void m2() {
        System.out.println(a);
        System.out.println(Programme2.a);
        System.out.println(name);
        System.out.println(Programme2.name);
        // call both static variable into the static method inside the print statement
    }

    public static void main(String[] args) {
        m2();
    }
}

