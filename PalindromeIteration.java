package zoho;

public class PalindromeIteration {
    public static void validNumber(int n) {
        if (isPalin(n)) {
            System.out.println(n + " is valid sum.");
            return;
        }
        int i = 1;
        while (i <= 5) {
            if (isPalin(n)) {
                System.out.println(n + " is valid sum.");
                return;
            }
            i++;
            n += reverse(n);
        }
        System.out.println(n + " is not valid number.");
    }

    public static boolean isPalin(int n) {
        int reversed = 0;
        int og = n;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return og == reversed;
    }

    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int n = 32;
        validNumber(n);
    }
}
