package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * <p>
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * <p>
 * Sum of two binary numbers: 101
 */
public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Binary number");
        String b = scanner.nextLine();
        System.out.println("Enter Second Binary number");
        String h = scanner.nextLine();
        int b1 = Integer.parseInt(b, 2);
        int h1 = Integer.parseInt(h, 2);
        int sum = b1 + h1;
        String binary = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + binary);
        scanner.close();
    }
}
