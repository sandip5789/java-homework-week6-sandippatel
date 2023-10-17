package homeworkweek6;
/**
 * Created by Sandip Patel
 * variable 4
 */
public class Programme4 {
    int a = 10; // a is a Instance variable
    int b = 20; // b is a Instance variable
    static String name = "Cricket Worldcup"; // name is a static variable
    static String place = "India"; // palce is static variable

    // declare Instance method
    // m1 is a Instance method
    public void m1() {
        System.out.println(a);// Instance call
        System.out.println(b);// Instance call
        System.out.println(name);// static call
        System.out.println(place);// static call
    }

    // declare static method
    // m2 is a static method
    public static void m2() {
        System.out.println(name);// static call
        System.out.println(place);// static call
        Programme4 s = new Programme4();// Instance call
        System.out.println(s.a);// Instance call
        System.out.println(s.b);// Instance call

    }
// declare main method
    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        obj.m1();
        m2();
    }
}
