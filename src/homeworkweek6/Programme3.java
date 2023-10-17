package homeworkweek6;

/**
 * Created by Sandip Patel
 * variable 2
 */

public class Programme3 {
    int a = 20;// a is a instance variable
    static int b = 50;// b is a static variable

    // declare Instance method
    // m1 is Instance method
    public void m1() {
        System.out.println(a);// Instance call
        System.out.println(b);// Static caall

    }

    //m2 is a Static method
    public static void m2() {
        System.out.println(b);// static call
        Programme3 s = new Programme3();
        System.out.println(s.a);// Instance call
    }

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        obj.m1();// Instance call
        m2();// static call
    }
}
