package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Program13 {
    int number1 = 87;
    int number2 = 88;
    int number3 = 75;
    int average = 83;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        double number1 = scanner.nextDouble();
        System.out.println("Enter number2");
        double number2 = scanner.nextDouble();
        System.out.println("Enter number3");
        double number3 = scanner.nextDouble();
        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average is" + average);
        scanner.close();
    }
}
