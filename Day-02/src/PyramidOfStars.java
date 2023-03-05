import java.util.Scanner;

public class PyramidOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows to print star pattern: ");
		int num=sc.nextInt();

		//for()-->rows
		for(int i=1; i<num;i++){
			//white space
			for(int j=1;j<num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
