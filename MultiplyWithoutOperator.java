package zoho;

public class MultiplyWithoutOperator {
    public static int multiply(int x, int y) {
        if (y == 0 || x == 0) {
            return 0;
        }

        if (y > 0) {
            // System.out.println(999);
            return (x + multiply(x, y - 1));
        }

        if (y < 0) {
            return -multiply(x, -y);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, -8));
    }
}
