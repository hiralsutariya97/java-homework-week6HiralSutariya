package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {
    // Instance variable
    public void addition(int a, int b) {
        int answer = a + b;
        // concatenation
        System.out.println("addition of two numbers" + a + "and" + b + "is: " + answer);
    }

    // Instance variable
    public void subtraction(int a, int b) {
        int answer = a - b;
        // concatenation
        System.out.println("subtraction of two numbers" + b + "and" + a + "is:" + answer);
    }

    // static variable
    public static void multiplication(int a, int b) {
        int answer = a * b;
        // concatenation
        System.out.println("multiplication of two numbers" + a + "and" + b + "is:" + answer);
    }

    // static variable
    public static void division(int a, int b) {
        int answer = a / b;
        // concatenation
        System.out.println("division of two numbers" + a + "and" + b + "is:" + answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program5 obj = new Program5();
        System.out.println("Enter First digit:");
        int a = scanner.nextInt();
        System.out.println("Enter Second digit:");
        int b = scanner.nextInt();
        obj.addition(a, b);
        obj.subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        scanner.close();
    }
}
