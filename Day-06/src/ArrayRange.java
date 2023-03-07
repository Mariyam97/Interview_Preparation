//To find the range of elements in an array in Java,you need to find the minimum and maximum values in the array. You can then subtract the minimum value from the maximum value to get the range.

//After we have found the minimum and maximum values in the array, we calculate the range by subtracting the minimum value from the maximum value.

//Finally, we print out the result which is the range of elements in the array.


public class ArrayRange {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 15, 1};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int range = max - min;
        System.out.println("The range of elements in the array is: " + range);
    }
}
