import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int len = arr.length;

		for (int i = 0; i < len / 2; i++) {
		    int temp = arr[i];
		    arr[i] = arr[len - i - 1];
		    arr[len - i - 1] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
