package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter area of circle");
        double area = scanner.nextDouble();
        double r = (7 * area / 22);
        System.out.println("Radius of circle = " + r);
        scanner.close();

    }
}
