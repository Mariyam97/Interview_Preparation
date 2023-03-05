
public class CheckPerfectSquare {
    public static void main(String[] args) {
        int n = 3; // Change this value to check for a different number
        boolean isPerfectSquare = checkPerfectSquare(n);
        if (isPerfectSquare) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
    }

    public static boolean checkPerfectSquare(int n) {
        int i = 1;
        while (n > 0) {
            n -= i;
            i += 2;
        }
        return n == 0;
    }
}
