


import java.util.Scanner;
public class IndexOfLastOccuerenceElement {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get the size of the array from the user
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Create the array
		int[] array = new int[size];

		// Get the elements of the array from the user
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Get the element to search for from the user
		System.out.print("Enter the element to search for: ");
		int element = scanner.nextInt();

		// Find the index of the last occurrence of the element in the array
		int lastIndex = -1;
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				lastIndex = i;
			}
		}

		// Print the index of the last occurrence of the element in the array
		if (lastIndex == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Last occurrence of the element is at index: " + lastIndex);
		}
	}
}
