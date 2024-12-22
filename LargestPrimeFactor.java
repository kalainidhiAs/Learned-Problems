package zoho;

public class LargestPrimeFactor {
    public static void primeFactor(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // System.out.println(1234);
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }

        // System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 71824;
        primeFactor(n);
    }
}
