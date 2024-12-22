package zoho;

public class Xprogram {
    public static void main(String[] args) {
        String x = "GEEKSFORGEEKS";
        int n = x.length();

        for (int i = 0; i < n; i++) {
            // System.out.println(n - i);
            for (int j = 0; j < n; j++) {
                // System.out.println(n - j);
                if (i == j || i + j == n - 1) {
                    System.out.print(x.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
