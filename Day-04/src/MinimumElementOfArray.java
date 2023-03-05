
public class MinimumElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {5, 3, 8, 1, 9};
		int min = myArray[0];

		for (int i = 1; i < myArray.length; i++) {
		    if (myArray[i] < min) {
		        min = myArray[i];
		    }
		}

		System.out.println("The minimum element is: " + min);

	}

}
