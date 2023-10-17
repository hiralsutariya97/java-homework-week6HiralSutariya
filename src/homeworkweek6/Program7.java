package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float fahrenheit, celsius;
        fahrenheit = 43;
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in celsius is; " + celsius);
        scanner.close();
    }
}
