
public class IndexOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 1, 3, 2, 4};
	    int target = 5;
	    int index = -1;

	    // Finding the index of the target value in the array
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] == target) {
	        index = i;
	        break;
	      }
	    }

	    // Printing the result
	    if (index != -1) {
	      System.out.println("The index of " + target + " is " + index);
	    } else {
	      System.out.println("The array does not contain " + target);
	    }
	}

}
