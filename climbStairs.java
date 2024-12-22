package zoho;

public class climbStairs {
    public int climb(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;

        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(new climbStairs().climb(2));
    }
}
