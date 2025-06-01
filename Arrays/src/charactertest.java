import java.util.Arrays;

public class charactertest {
    public static void findNonRepeatingAndDuplicates(String str) {
        int[] freq = new int[256]; // Frequency array for all ASCII characters

        // Traverse the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        StringBuilder nonRepeating = new StringBuilder(); // To store non-repeating characters
        StringBuilder duplicates = new StringBuilder();    // To store duplicate characters

        // Identify non-repeating characters and duplicates
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                nonRepeating.append(ch); // Non-repeating character
            } else if (freq[ch] > 1 && duplicates.indexOf(String.valueOf(ch)) == -1) {
                duplicates.append(ch); // Add to duplicates if it's not already there
            }
        }

        // Print non-repeating characters
        System.out.println("Non-repeating characters: " + nonRepeating.toString());

        // Print duplicates
        System.out.print("Duplicate characters: " + duplicates.toString());
    }

    public static void main(String[] args) {
        String str = "programming";
        findNonRepeatingAndDuplicates(str);
    }
}
