package zoho;

/**
 * distinctArrayDigit
 */
import java.util.*;

public class distinctArrayDigit {
    public static void makeDistinct(int arr[]) {
        int n = arr.length;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String a = Integer.toString(arr[i]);
            for (int j = 0; j < a.length(); j++) {
                set.add(a.charAt(j));
            }
        }

        System.out.println(set);

        int newarr[] = new int[set.size()];
        int i = 0;
        for (char c : set) {
            newarr[i++] = Character.getNumericValue(c);
        }

        System.out.println(Arrays.toString(newarr));

    }

    public static void main(String[] args) {
        int arr[] = { 131, 11, 48 };
        makeDistinct(arr);
    }
}