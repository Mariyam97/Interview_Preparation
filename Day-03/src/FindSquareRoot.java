
public class FindSquareRoot {
    public static void main(String[] args) {
        int n = 25; // Change this value to find the square root of a different number
        double epsilon = 0.00001; // Change this value to adjust the accuracy of the result
        double guess = n / 2.0;
        double result = findSquareRoot(n, guess, epsilon);
        System.out.println("The square root of " + n + " is: " + result);
    }

    public static double findSquareRoot(int n, double guess, double epsilon) {
        double result = (guess + (n / guess)) / 2.0;
        if (Math.abs(result - guess) < epsilon) {
            return result;
        } else {
            return findSquareRoot(n, result, epsilon);
        }
    }
}
