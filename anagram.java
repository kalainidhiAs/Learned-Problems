package zoho;

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String a = "cat";
        String b = "aCt";

        char arr[] = a.toCharArray();
        char brr[] = b.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0; i < a.length(); i++) {
            if (arr[i] != brr[i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
