package homeworkweek6;
/**
Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.


 */

public class Program3 {
    int a = 11;
    static String name = "Juliet";

    public static void main(String[] args) {
        Program3 t = new Program3();
        System.out.println(t.a);
        t.m1();
        m2();

    }
    public void m1() {
        Program3 t = new Program3();
        System.out.println(t.a);
    }
    public static void m2() {
        System.out.println(name);
        System.out.println(Program3.name);

    }
}

