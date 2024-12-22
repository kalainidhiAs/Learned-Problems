package zoho;

public class AddOrEvenInDigit {
    public static void main(String[] args) {
        int n = 123456789;
        int even = 0;
        int odd = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n /= 10;
        }

        System.out.println(even);
        System.out.println(odd);
    }
}
