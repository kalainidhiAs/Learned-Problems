package zoho;

import java.util.Arrays;

public class CountPalinWordsInASentence {
    public static int countPalin(String s) {
        // System.out.println(s);
        String str[] = s.split(" ");
        System.out.println(Arrays.toString(str));
        int count = 0;
        for (String i : str) {

            if (isPalin(i.toLowerCase())) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPalin(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countPalin("Madam "
                + "Arora teaches malayalam"));

        System.out.println(countPalin("Nitin "
                + "speaks malayalam"));
    }
}
