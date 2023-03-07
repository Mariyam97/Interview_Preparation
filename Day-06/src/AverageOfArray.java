
public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10}; // sample array

        // calculate sum of array elements
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        // calculate average of array elements
        double avg = (double)sum / arr.length;

        // display the average
        System.out.println("Average of array elements: " + avg);
    }
}
