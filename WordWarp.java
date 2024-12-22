package zoho;

import java.util.Arrays;

public class WordWarp {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 5 };
        int K = 6;
        int minCost = calculateMinCost(nums, K);
        System.out.println("The minimum cost is: " + minCost);
    }

    public static int calculateMinCost(int[] nums, int K) {
        int n = nums.length;
        int[] dp = new int[n + 1];

        // Initialize dp array with a large number
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[n] = 0; // No cost for the end of the sequence

        // Calculate minimum cost dp array
        for (int i = n - 1; i >= 0; i--) {
            int length = -1; // because we want to include space after each word except the last one
            for (int j = i; j < n; j++) {
                length += nums[j] + 1; // include space between words

                if (length > K) {
                    break; // if line length exceeds K, break
                }
                int cost = (j == n - 1) ? 0 : (K - length) * (K - length); // no cost for the last line
                if (dp[i] > cost + dp[j + 1]) {
                    dp[i] = cost + dp[j + 1];
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}
