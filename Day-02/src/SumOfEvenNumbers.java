
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 12; i < 30; i += 2) {
            sum += i;
        }
        System.out.println("The sum of even numbers greater than 10 and less than 30 is " + sum);
    }
}
