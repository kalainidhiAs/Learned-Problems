package zoho;

public class AddingDigitToNumber {
    public static void add(int n, int d) {
        String num = Integer.toString(n);
        // String result = "";

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int number = (int) (c - '0');
            int addition = number + d;
            System.out.print(addition);
            // System.out.print(addition);
        }
    }

    public static void main(String[] args) {
        int number = 28752;
        int digit = 4;
        add(number, digit);
    }
}
