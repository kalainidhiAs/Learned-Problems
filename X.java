package zoho;

public class X {
    public static void print(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print(k++);
                } else {
                    System.out.print(" ");
                }
            }
            k = 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);

    }
}
