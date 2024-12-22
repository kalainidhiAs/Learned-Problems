package zoho;

import java.util.Arrays;

public class vowelReverse {
    static String modify(String s) {
        // your code here
        int i = 0, j = s.length() - 1;
        char arr[] = s.toCharArray();
        System.out.println(Arrays.toString(arr));

        while (i <= j) {
            // System.out.println(i);
            if (isvowel(arr[i]) && isvowel(arr[j])) {
                swap(arr, i, j);
                i++;
                j--;
                System.out.println("check: " + Arrays.toString(arr));
            } else if (isvowel(arr[i]) && !isvowel(arr[j])) {
                j--;
            } else if (!isvowel(arr[i]) && isvowel(arr[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }

        return new String(arr);
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isvowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String S = "practice";
        System.out.println(modify(S));
    }
}
