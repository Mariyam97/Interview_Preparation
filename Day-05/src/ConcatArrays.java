import java.util.Arrays;

public class ConcatArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};

		int[] result = new int[arr1.length + arr2.length];
		int index = 0;

		for (int i = 0; i < arr1.length; i++) {
		    result[index++] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
		    result[index++] = arr2[i];
		}

		System.out.println(Arrays.toString(result));

	}

}
