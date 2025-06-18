import java.util.Scanner;

public class CustomTrim {

    // Method to find start and end index excluding leading/trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end;

        // Find first non-space from start
        while (true) {
            try {
                if (str.charAt(start) != ' ')
                    break;
                start++;
            } catch (Exception e) {
                break;
            }
        }

        // Find first non-space from end
        end = start;
        while (true) {
            try {
                str.charAt(end);
                end++;
            } catch (Exception e) {
                break;
            }
        }

        end--; // move back from end overflow

        // Adjust end for trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // Create substring using charAt
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Compare two strings using charAt
    public static boolean compareStrings(String a, String b) {
        int i = 0;
        while (true) {
            try {
                char ch1 = a.charAt(i);
                char ch2 = b.charAt(i);
                if (ch1 != ch2)
                    return false;
                i++;
            } catch (Exception e) {
                break;
            }
        }

        // Check if both ended at the same length
        try {
            a.charAt(i);
            return false; // a longer
        } catch (Exception e) {
        }

        try {
            b.charAt(i);
            return false; // b longer
        } catch (Exception e) {
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text with leading and trailing spaces: ");
        String str = input.nextLine();

        // Find trim indices and create custom trimmed substring
        int[] indices = findTrimIndices(str);
        String trimmedCustom = customSubstring(str, indices[0], indices[1]);
        String trimmedBuiltIn = str.trim();

        // Compare custom trimmed string with built-in trimmed string
        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("\n--- Trimming Result ---");
        System.out.println("Custom Trimmed: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both equal? " + isSame);

        // Close the scanner
        input.close();
    }
}