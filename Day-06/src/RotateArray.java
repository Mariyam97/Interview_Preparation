
import java.util.Arrays;

public class RotateArray {
    
    public static void main(String[] args) {
        
        // Example array to rotate
        int[] arr = {1, 2, 3, 4, 5};

        // Rotate array to the right by 2 steps
        rotateArray(arr, 2);

        // Print the rotated array to the console
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int k) {
        
        // Get the length of the input array
        int n = arr.length;

        // Calculate the actual rotation amount (accounting for wraparound)
        int actualRotation = k % n;
        if (actualRotation < 0) {
            actualRotation += n;
        }

        // Reverse the entire array
        reverseArray(arr, 0, n - 1);

        // Reverse the first actualRotation elements
        reverseArray(arr, 0, actualRotation - 1);

        // Reverse the remaining elements
        reverseArray(arr, actualRotation, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        
        // Reverse the elements in the specified range of the input array
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

