
import java.util.Arrays;

public class ShiftArray {
    
    public static void main(String[] args) {
        
        // Example array to shift
        int[] arr = {1, 2, 3, 4, 5};

        // Shift array to the left by 2 positions
        int[] leftShiftedArr = shiftArray(arr, -2);

        // Shift array to the right by 1 position
        int[] rightShiftedArr = shiftArray(arr, 1);

        // Print the shifted arrays to the console
        System.out.println(Arrays.toString(leftShiftedArr));
        System.out.println(Arrays.toString(rightShiftedArr));
    }

    public static int[] shiftArray(int[] arr, int shiftBy) {
        
        // Get the length of the input array
        int n = arr.length;

        // Create a new array to hold the shifted elements
        int[] shiftedArr = new int[n];

        // Calculate the actual shift amount (accounting for wraparound)
        int actualShift = shiftBy % n;
        if (actualShift < 0) {
            actualShift += n;
        }

        // Shift the elements of the input array to the new array
        for (int i = 0; i < n; i++) {
            int newIndex = (i + actualShift) % n;
            shiftedArr[newIndex] = arr[i];
        }

        return shiftedArr;
    }
}
