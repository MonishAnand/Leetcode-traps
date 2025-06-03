import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] a = {8,9,5,7,4,2,3,1};
        int[] ans = mergesort(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergesort(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int mid = a.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(a, mid, a.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;  // Initialize i, j, k

        // Merge left and right in sorted order
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left (if any)
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements from right (if any)
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }



        return mix;  // Return the merged array
    }
}
