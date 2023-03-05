
public class SearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 1, 3, 2, 4};
	    int target = 9;
	    boolean found = false;

	    // Checking if the array contains the target value
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] == target) {
	        found = true;
	        break;
	      }
	    }

	    // Printing the result
	    if (found) {
	      System.out.println("The array contains : " + target);
	    } else {
	      System.out.println("The array does not contain : " + target);
	    }
	}

}
