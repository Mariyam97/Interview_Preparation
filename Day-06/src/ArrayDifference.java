
import java.util.ArrayList;
import java.util.List;

public class ArrayDifference {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 7};

        int[] difference = getDifference(array1, array2);

        System.out.print("Array1: ");
        printArray(array1);

        System.out.print("Array2: ");
        printArray(array2);

        System.out.print("Difference: ");
        printArray(difference);
    }

    public static int[] getDifference(int[] array1, int[] array2) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int num : array1) {
            list1.add(num);
        }

        List<Integer> list2 = new ArrayList<Integer>();
        for (int num : array2) {
            list2.add(num);
        }

        list1.removeAll(list2);

        int[] difference = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            difference[i] = list1.get(i);
        }

        return difference;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/* the getDifference() method takes two arrays as input parameters and returns an array that contains the elements that are in the first array but not in the second array. The method uses ArrayList to make it easier to remove elements from the first array.

The printArray() method is used to print out the elements in an array.
The difference array contains the elements that are in array1 but not in array2.*/