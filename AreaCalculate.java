import java.io.*;
import java.util.Scanner;
public class AreaCalculate{
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("input.txt")); // Assuming input is stored in "input.txt"
            PrintWriter writer = new PrintWriter("output.txt"); // Output will be stored in "output.txt"
            int base = scanner.nextInt();
            int height = scanner.nextInt();
            int length = scanner.nextInt();
            int width = scanner.nextInt();

            int triangleArea = (base * height) / 2;
            int rectangleArea = length * width;
            int totalArea = triangleArea + rectangleArea;

            writer.println("Area of the triangle: " + triangleArea);
            writer.println("Area of the rectangle: " + rectangleArea);
            writer.println("Total area of the shape: " + totalArea);

            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
