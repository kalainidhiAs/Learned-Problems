package zoho;

import java.util.HashSet;

public class permutation {
    public static void helper(char a[], int start, HashSet<String> h) {

        if (start == a.length - 1) {
            h.add(new String(a));
            return;
        }

        for (int i = 0; i < a.length; i++) {
            swap(a, start, i);
            helper(a, start + 1, h);
            swap(a, start, i);
        }
    }

    public static void swap(char a[], int start, int end) {
        char temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }

    public static void main(String[] args) {
        String s = "BANKING";
        char a[] = s.toCharArray();
        HashSet<String> set = new HashSet<>();
        helper(a, 0, set);

        System.out.println(set);
        System.out.println(set.size());
    }
}
