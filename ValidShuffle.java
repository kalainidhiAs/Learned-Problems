package zoho;

import java.util.*;

public class ValidShuffle {
    public static boolean isShuffle(String first, String second, String result) {
        char f[] = first.toCharArray();
        char s[] = second.toCharArray();
        char r[] = result.toCharArray();

        Arrays.sort(f);
        Arrays.sort(s);
        Arrays.sort(r);

        // System.out.println(Arrays.toString(r));

        int indexF = 0, indexS = 0, indexR = 0;

        while (indexR < r.length) {

            if (indexF < f.length && f[indexF] == r[indexR]) {
                indexF++;
                indexR++;
            } else if (indexS < s.length && s[indexS] == r[indexR]) {
                indexS++;
                indexR++;
            } else {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = { "1XY2", "Y1X2", "Y21XX" };

        for (int i = 0; i < results.length; i++) {
            if (results[i].length() == first.length() + second.length()) {
                if (isShuffle(first, second, results[i])) {
                    System.out.println(results[i] + " is valid shuffle of " + first + " and " + second);
                } else {
                    System.out.println(results[i] + " is NOT valid shuffle of " + first + " and " + second);
                }
            } else {
                System.out.println(results[i] + " is NOT valid shuffle of " + first + " and " + second);
            }
        }
    }
}
