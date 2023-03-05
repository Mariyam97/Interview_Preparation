public class NumberToWord {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        int number = 12345; // Change this value to convert a different number
        String word = convertNumberToWord(number);
        System.out.println("The word representation of " + number + " is: " + word);
    }

    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            return "minus " + convertNumberToWord(-number);
        }

        String word = "";
        if ((number / 1000) > 0) {
            word += convertNumberToWord(number / 1000) + " thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0) {
            word += convertNumberToWord(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 10) {
                word += ones[number];
            } else if (number < 20) {
                word += teens[number - 10];
            } else {
                word += tens[number / 10];
                if ((number % 10) > 0) {
                    word += "-" + ones[number % 10];
                }
            }
        }

        return word.trim();
    }
}
