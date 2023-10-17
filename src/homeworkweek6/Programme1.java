package homeworkweek6;

/**
 * Created by Sandip Patel
 * Instance method
 */
public class Programme1 {
    int a = 20; // a is a Instance or Global variable
    String name = "Cricket Worldcup"; // name is a Instance or Global variable

    // declare instance method
    // m1 is instance method
    public void m1() {
        Programme1 s = new Programme1();// s is object
        System.out.println(s.a);
        System.out.println(s.name);

    }

    // call both instance variable into the instance method inside the print statement
    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        System.out.println(obj.a);
        System.out.println(obj.name);
        obj.m1();

    }
}
