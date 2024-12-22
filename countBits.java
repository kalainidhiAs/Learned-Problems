package zoho;

public class countBits {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;

        while (n != 0) {
            count += n % 2;
            n /= 2;
        }

        System.out.println(count);
    }
}
