
public class ArrayElementCount {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 4, 2, 5};
		int element = 2;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}

		System.out.println("The number of occurrences of " + element + " in the array is: " + count);
	}
}
