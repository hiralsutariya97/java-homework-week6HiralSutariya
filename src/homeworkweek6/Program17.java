package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * <p>
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * <p>
 * Binary number is: 101
 */
public class Program17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a decimal number:");
        double decimal = scanner.nextDouble();
        String binary = Integer.toString((int) decimal);
        System.out.println("Result is Binary number is:" + Integer.toBinaryString(Integer.parseInt(binary)));
        scanner.close();
    }
}