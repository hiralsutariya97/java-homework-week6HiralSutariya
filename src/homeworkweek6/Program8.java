package homeworkweek6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter area of triangle");
        String name = scanner.nextLine();
        int b = 4;
        int h = 13;
        int area = b * h / 2;
        System.out.println("Area of triangle is" + area);
        scanner.close();

    }
}