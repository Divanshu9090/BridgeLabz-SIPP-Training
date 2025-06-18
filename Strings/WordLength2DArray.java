import java.util.Scanner;

public class WordLength2DArray {

    // Split the text into words without using split()
    public static String[] splitWords(String text) {
        String[] words = new String[100]; // assume max 100 words
        StringBuilder word = new StringBuilder();
        int index = 0;

        for (int i = 0;; i++) {
            try {
                char ch = text.charAt(i);
                if (ch == ' ') {
                    if (word.length() > 0) {
                        words[index++] = word.toString();
                        word.setLength(0);
                    }
                } else {
                    word.append(ch);
                }
            } catch (Exception e) {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                }
                break;
            }
        }

        // Trim array
        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }
        return result;
    }

    // Method to find string length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return count;
    }

    // Return 2D String array of words and their lengths
    public static String[][] getWordLengthPairs(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for a line of text
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        // Split the input into words and get their lengths
        String[] words = splitWords(input);
        String[][] wordData = getWordLengthPairs(words);

        // Display in tabular format
        System.out.println("\n--- Word and Length Table ---");
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        for (String[] row : wordData) {
            String word = row[0];
            int length = Integer.parseInt(row[1]);
            System.out.printf("%-15s %-10d\n", word, length);
        }

        // Close the scanner
        sc.close();
    }
}
