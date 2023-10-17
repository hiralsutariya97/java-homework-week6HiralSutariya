package homeworkweek6;

public class Program2 {
    /**
     * Write a Java programme using the following steps.
     * 2.1 Declare two static variables
     * 2.2 Declare one static method
     * 2.3 Call both static variables into the static method inside the print statement.
     * 2.4 Declare the Main method.
     * 2.5 Call the static method into the Main method and Run the programme.
     */
    static int a = 67;
    static String name = "Juliet";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Program2.a);
        System.out.println(name);
        System.out.println(Program2.name);
    }

    public void m1() {
        System.out.println(a);
        System.out.println(Program2.a);
    }
}
