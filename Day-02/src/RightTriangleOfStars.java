import java.util.Scanner;

public class RightTriangleOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows to print star pattern: ");
		int num=sc.nextInt();

		for(int i=1;i<num;i++){
			for(int j =1; j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
