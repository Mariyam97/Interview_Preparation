
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // Change this value to find the sum of natural numbers up to a different number
        int sum = calculateSumOfNaturalNumbers(n);
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
    }

    public static int calculateSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

