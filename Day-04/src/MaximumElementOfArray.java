
public class MaximumElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {5, 3, 8, 1, 9};
		int max = myArray[0];

		for (int i = 1; i < myArray.length; i++) {
		    if (myArray[i] > max) {
		        max = myArray[i];
		    }
		}

		System.out.println("The maximum element is: " + max);

	}

}
