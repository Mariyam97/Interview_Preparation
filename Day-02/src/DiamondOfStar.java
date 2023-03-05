import java.util.Scanner;

public class DiamondOfStar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int spaces = rows - 1;
        
        // Upper half of diamond
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
        }
        
        // Lower half of diamond
        spaces = 1;
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces++;
        }
    }
}
