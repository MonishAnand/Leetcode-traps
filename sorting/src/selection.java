import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int a[] = {2, 7, 9, 3, 4, 5};
        select(a);
        System.out.println(Arrays.toString(a));  // This will now print the sorted array
    }

    static void select(int a[]) {
        // Sorting array in ascending order using max selection
        for (int i = 0; i < a.length; i++) {
            int last = a.length - i - 1;
            int maxIndex = getMaxIndex(a, 0, last);
            // Swap max element with the last element of the unsorted part
            int temp = a[maxIndex];
            a[maxIndex] = a[last];
            a[last] = temp;
        }
    }

    static int getMaxIndex(int a[], int start, int end) {
        int maxIndex = start;  // Initialize maxIndex to the start
        for (int i = start; i <=end; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;  // Update maxIndex when a larger element is found
            }
        }
        return maxIndex;
    }
}