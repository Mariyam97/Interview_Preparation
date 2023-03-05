
public class FibonacciSeries {

	
	    public static void main(String[] args) {
	        int n = 10; // Change this value to set the number of terms to print
	        int prev = 0, curr = 1;
	        System.out.print(prev + " " + curr + " ");
	        for (int i = 3; i <= n; i++) {
	            int next = prev + curr;
	            System.out.print(next + " ");
	            prev = curr;
	            curr = next;
	        }
	    }
	}
