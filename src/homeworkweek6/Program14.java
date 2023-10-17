package homeworkweek6;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * <p>
 * Test Data:
 * Width = 5.5 Height = 8.5
 * <p>
 * Expected Output:
 * <p>
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {
    public static void main(String[] args) {
        final double width = 5.6;
        final double height = 8.5;
        double perimeter = 2 * (height + width);
        double area = height * width;
        System.out.println("area is" + height + "*" + width + "=" + area);
        System.out.println("perimeter is 2 *" + "(" + height + "+" + width + ") =" + perimeter);
    }
}

