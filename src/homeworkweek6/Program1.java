package homeworkweek6;


public class Program1 {

    /**
     * 1. Write a Java programme using the following steps.
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */

    String name = "Juliet";
    int a = 20;

    public void bmw() {
        System.out.println("bmw");
        System.out.println("name = " + name);
        System.out.println("a =" + a);

    }

    public static void main(String[] args) {
        Program1 t1 = new Program1();
        t1.bmw();
    }
}



