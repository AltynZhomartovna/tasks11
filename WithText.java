public class WithText{
    public static void main(String[] args) {
        // Define a sample string
        String text = "Today is day of OOP!";
        // 1. Find the length of the string
        int length = text.length();
        System.out.println("Length of the string: " + length);
        // 2. Convert the string to uppercase
        String upperCaseText = text.toUpperCase();
        System.out.println("Uppercase text: " + upperCaseText);
        // 3. Convert the string to lowercase
        String lowerCaseText = text.toLowerCase();
        System.out.println("Lowercase text: " + lowerCaseText);
        // 4. Extract a substring
        String substring = text.substring(7, 12); // Extracts characters from index 7 to index 11
        System.out.println("Substring: " + substring);
        // 5. Replace text
        String replacedText = text.replace("OOP", "BD");
        System.out.println("Replaced text: " + replacedText);
        // 6. Check if the string contains a certain substring
        boolean containsWord = text.contains("day");
        System.out.println("Contains 'day': " + containsWord);
        // 7. Split the string
        String[] words = text.split("\\s+"); // Split by whitespace
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
        // 8. Trim leading and trailing whitespace
        String spacedText = "   Example text with spaces   ";
        String trimmedText = spacedText.trim();
        System.out.println("Trimmed text: '" + trimmedText + "'");
        // 9. Concatenate strings
        String firstName = "Altyn";
        String lastName = "Seitzhanova";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        // 10. Compare strings
        String str1 = "Java";
        String str2 = "Java";
        int comparison = str1.compareToIgnoreCase(str2);
        System.out.println("Comparison result: " + comparison);
        // Prints 0 if the strings are equal, negative if str1 is lexicographically less than str2,
        // positive if str1 is lexicographically greater than str2
    }
}
