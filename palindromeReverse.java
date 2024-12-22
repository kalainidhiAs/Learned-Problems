package zoho;

public class palindromeReverse {
    static long isSumPalindrome(long n) {
        // code here

        if (isPalindrome(n)) {
            return n;
        }

        int iteration = 0;
        while (!isPalindrome(n) && iteration < 5) {
            n += reverse(n);
            if (isPalindrome(n)) {
                return n;
            }
            iteration++;
        }
        return -1;
    }

    static long reverse(long n) {
        long reversed = 0;
        while (n != 0) {
            long d = n % 10;
            reversed = reversed * 10 + d;
            n /= 10;
        }
        // System.out.println(reversed + " pa");
        return reversed;
    }

    static boolean isPalindrome(long n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        long n = 37;
        System.out.println(isSumPalindrome(n));
    }
}
