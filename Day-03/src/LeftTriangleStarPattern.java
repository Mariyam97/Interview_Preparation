
public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to set the number of rows to print
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
