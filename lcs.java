package zoho;

import java.util.*;;

public class lcs {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabc";

        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > dp[i][j - 1]) {
                        System.out.print(str1.charAt(i - 1));
                    }
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(Arrays.deepToString(dp));

        System.out.println(dp[n][m]);
    }
}

/*
 * class Solution {
 * public int longestCommonSubsequence(String text1, String text2) {
 * if(text1.equals(text2)){
 * return text1.length();
 * }
 * 
 * if(text2.length() > text1.length()) {
 * return longestCommonSubsequence(text2, text1);
 * }
 * 
 * // char[] s1 = text2.length() > text1.length()
 * // ? text2.toCharArray()
 * // : text1.toCharArray();
 * // char[] s2 = text2.length() > text1.length()
 * // ? text1.toCharArray()
 * // : text2.toCharArray();
 * 
 * char[] s1 = text1.toCharArray();
 * char[] s2 = text2.toCharArray();
 * 
 * int[] prev = new int[s2.length + 1];
 * int[] curr = new int[s2.length + 1];
 * 
 * for (int i = 0; i < s1.length; i++) {
 * for (int j = 0; j < s2.length; j++) {
 * if (s1[i] == s2[j]) {
 * curr[j +1] = prev[j] + 1;
 * }else{
 * curr[j + 1] = Math.max(curr[j], prev[j+1]);
 * }
 * }
 * 
 * var temp = prev;
 * prev = curr;
 * curr = temp;
 * }
 * 
 * // the original answer is in prev
 * return prev[prev.length - 1];
 * }
 * 
 */