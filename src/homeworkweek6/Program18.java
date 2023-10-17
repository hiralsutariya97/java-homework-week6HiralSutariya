package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First number");
        int number1 = scanner.nextInt();
        System.out.println("Input Second number");
        int number2 = scanner.nextInt();
        System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
        System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
        System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
        System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
        System.out.println(number1 + "mod" + number2 + "=" + (number1 % number2));
        scanner.close();
    }
}
