package zoho;

public class AddDigit {

    static int len(int num) {
        while (num >= 10) {
            int temp = 0;
            while (num > 10) {
                temp = num % 10;
                num /= 10;
            }
            num = temp;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 35;
        System.out.println(len(n));
    }
}
