import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine().toLowerCase(); // Convert the input to lowercase for case insensitivity
        System.out.println("Enter a letter to count: ");
        char letter = scanner.next().toLowerCase().charAt(0); // Convert the input letter to lowercase for case insensitivity
        scanner.close();
        int letterCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == letter) {
                letterCount++;
            }
        }
        System.out.println("Number of occurrences of letter '" + letter + "': " + letterCount);
    }
}
