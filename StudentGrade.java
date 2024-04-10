import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        try {
            File file = new File("students.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                String studentName = parts[0];
                int sum = 0;
                for (int i = 1; i < parts.length; i++) {
                    sum += Integer.parseInt(parts[i]);
                }

                double averageGrade = (double) sum / (parts.length - 1);
                System.out.println("Average grade for " + studentName + ": " + averageGrade);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
