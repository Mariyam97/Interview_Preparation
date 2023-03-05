
public class AccessingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accessing the first element of an array java

		int[] myArray = {1, 2, 3, 4, 5};
		int firstElement = myArray[0];
		System.out.println(firstElement);

		//Accessing the last element of an array
		int[] myArrays = {1, 2, 3, 4, 5};
		int lastElement = myArrays[myArrays.length - 1];
		System.out.println(lastElement);

		//Changing the value of an array element java
		int[] array = {1, 2, 3, 4, 5};
		array[2] = 10;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		//Printing all elements of an array using a for loop
		int[] array1 = {1, 2, 3, 4, 5};

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		//Printing all elements of an array using a for-each loop
		int[] myArray1 = {1, 2, 3, 4, 5};

		for (int element : myArray1) {
			System.out.print(element + " ");
		}

	}

}
