package zoho;

import java.util.Scanner;

public class numberTOword {
    private static final String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void convert(int input) {

        if (input < 0 && 999 > 0) {
            return;
        }

        int count = 0;
        String one = "";
        String two = "";
        String word = "";
        while (input != 0) {
            int rem = 0;
            rem = input % 10;
            input /= 10;
            count++;

            if (count == 1) {
                one = ones[rem];
                // System.out.println(one);
            } else if (count == 2) {
                two = tens[rem];
                // System.out.println(two);
            } else {
                if (rem != 0) {
                    word = ones[rem] + " hundred ";
                    // System.out.println(word);
                }

            }
        }

        System.out.println(word + " " + two + " " + one);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();
        convert(input);
    }
}
