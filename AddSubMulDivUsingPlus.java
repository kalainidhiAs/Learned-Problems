package zoho;

public class AddSubMulDivUsingPlus {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a + (-b);
    }

    public static int mul(int a, int b) {
        int product = 0;
        for (int i = 1; i <= b; i++) {
            product += a;
        }
        return product;
    }

    public static int div(int a, int b) {
        int sum = b;
        int count = 0;
        while (sum <= a) {
            sum += a;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
    }
}
