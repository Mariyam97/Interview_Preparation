import java.util.Scanner;

public class AirthmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1: ");
		int num1= sc.nextInt();
		System.out.println("Enter 2um1: ");
		int num2= sc.nextInt();

		int sum=num1 + num2;
		System.out.println("Sum =" + sum);
		int diff=num1 - num2;
		System.out.println("Difference =" + diff);
		int product=num1 * num2;
		System.out.println("Product=" + product);
		int quotient=num1 / num2;
		System.out.println("Quotient =" + quotient);
		
	}

}
