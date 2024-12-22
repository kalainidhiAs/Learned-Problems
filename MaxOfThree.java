package zoho;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 15, b = 10, c = 1;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (c > a) {
            int temp = c;
            c = a;
            a = temp;
        }

        System.out.println(a);
    }
}
