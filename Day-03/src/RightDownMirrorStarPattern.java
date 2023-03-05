
public class RightDownMirrorStarPattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to set the number of rows to print
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
