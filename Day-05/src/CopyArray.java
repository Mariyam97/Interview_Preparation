import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {


		//1. System.arraycopy() method:
		int[] sourceArray = {1, 2, 3, 4, 5};
		int[] destArray = new int[sourceArray.length];

		System.out.println();

		// Copy the entire source array to the destination array
		System.arraycopy(sourceArray, 0, destArray, 0, sourceArray.length);

		// Print the contents of the destination array
		for (int i = 0; i < destArray.length; i++) {
			System.out.print(destArray[i] + " ");
		}


		//2. Arrays.copyOf() method:

		int[] originalArray = {1, 4, 5};

		// Copy the entire original array to a new array
		int[] newArray = Arrays.copyOf(originalArray, originalArray.length);
		System.out.println();
		// Print the contents of the new array
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println();

		//3.clone method
		int[] sourceArray1 = {1, 2, 3, 4, 5};

		// Create a copy of the source array using clone()
		int[] destArray1 = sourceArray1.clone();

		// Print the contents of the destination array
		for (int i = 0; i < destArray1.length; i++) {
			System.out.print(destArray1[i] + " ");
		}
	}


}




