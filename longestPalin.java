package zoho;

import java.util.*;;

public class longestPalin {
    public static void palin(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i - 1][j + 1] == 1)) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = 0;
                }
            }

        }

        System.out.println(Arrays.deepToString(dp));
    }

    public static void main(String[] args) {
        String s = "babad";
        palin(s);
    }
}
