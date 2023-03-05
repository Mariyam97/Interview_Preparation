import java.util.Arrays;

public class SortArrayinAscendingOrder {

	public static void main(String[] args) {
		
		//1. Arrays.sort() method
        int[] arr = { 5, 2, 8, 3, 1, 6, 9, 7, 4 };
        
        // Sort array in ascending order
        Arrays.sort(arr);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        
        
        //2. Bubble sort
        int[] array = { 5, 2, 8, 3, 1, 6, 9, 7, 4 ,10};
        
        // Sort array in ascending order using bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    }

