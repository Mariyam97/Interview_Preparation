import java.util.Arrays;
import java.util.Comparator;

public class SortArrayinDescendingOrder {
	public static void main(String[] args) {
	    int[] arr = {5, 1, 3, 2, 4};

	    // 1. Sorting the array in descending order using bubble sort
	    for (int i = 0; i < arr.length - 1; i++) {
	      for (int j = 0; j < arr.length - i - 1; j++) {
	        if (arr[j] < arr[j + 1]) {
	          int temp = arr[j];
	          arr[j] = arr[j + 1];
	          arr[j + 1] = temp;
	        }
	      }
	    }

	    // Printing the sorted array
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    
	    //2.sort & comparator method
	    
	    Integer[] array = {5, 1, 3, 2, 4};

	    // Using a custom Comparator to sort in reverse order
	    Arrays.sort(array, Comparator.reverseOrder());

	    // Printing the sorted array
	    System.out.println(Arrays.toString(array));
	  }
}
