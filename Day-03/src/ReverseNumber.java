
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345; // Change this value to reverse a different number
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("The reversed number is: " + reversed);
    }
}
