
public class LeftTrianglePascalsTriangle {
    public static void main(String[] args) {
        int n = 5; // Change this value to set the number of rows to print
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            for (int k = i + 1; k < n; k++) {
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}

