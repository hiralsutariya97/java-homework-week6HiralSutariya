package homeworkweek6;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program4 {
    int a = 11;
    String name = "Juliet";

    static int b = 22;
    static String number = "33";

    public static void main(String[] args) {
        Program4 t = new Program4();
        System.out.println(t.a);
        System.out.println(t.name);
        t.m1();
        m2();
    }
    public void m1() {
        Program4 t = new Program4();
        System.out.println(a);
        System.out.println(t.a);

    }
    public static void m2() {
        Program4 t1 = new Program4();
        System.out.println(b);
        System.out.println(b);
        System.out.println(number);
        System.out.println(number);
    }
}

