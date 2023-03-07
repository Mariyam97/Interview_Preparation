
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    
    public static void main(String[] args) {
        
        // Example array with duplicates
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};

        // Call the removeDuplicates method
        int[] uniqueArr = removeDuplicates(arr);

        // Print the unique array to the console
        System.out.println(Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        
        // Get the length of the input array
        int n = arr.length;

        // Check for edge case where array is empty or has only one element
        if (n == 0 || n == 1) {
            return arr;
        }

        // Sort the array to group duplicates together
        Arrays.sort(arr);

        // Use two pointers to keep track of unique elements
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        // Add the last element (which is always unique) to the result
        arr[j++] = arr[n - 1];

        // Resize the result array to only include unique elements
        int[] result = Arrays.copyOf(arr, j);

        return result;
    }
}
