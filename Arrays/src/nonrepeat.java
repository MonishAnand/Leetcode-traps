import java.util.Arrays;

public class nonrepeat {

    // Function to find all repeating elements in a sorted array
    static void findRepeatingElementsSorted(int[] arr) {
        Arrays.sort(arr);  // Step 1: Sort the array first
        System.out.println(Arrays.toString(arr));

        System.out.println("Repeating elements in the array are:");
        for (int i = 1; i < arr.length; i++) {  // Step 2: Traverse through the array
            if (arr[i] != arr[i - 1] && arr[i]!=arr[i+1]) {  // Step 3: Check if current element equals the previous one
                System.out.print(arr[i] + " ");  // Print the duplicate element

                // Step 4: Skip any further duplicates of the same element
                while (i < arr.length && arr[i] == arr[i - 1]) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 8, 8, 9, 10, 5};  // Example array

        // Find and print repeating elements
        findRepeatingElementsSorted(arr);
    }
}
