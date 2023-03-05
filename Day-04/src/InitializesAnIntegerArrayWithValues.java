
public class InitializesAnIntegerArrayWithValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = new int[5];

		for (int i = 0; i < myArray.length; i++) {
		    myArray[i] = i + 1;
			System.out.print(myArray[i]);
		}


	}

}
