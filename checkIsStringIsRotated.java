package zoho;

import java.util.ArrayList;

public class checkIsStringIsRotated {
    public static boolean isRotated(String s1, String s2, int k) {
        int i;
        int index = s1.length() - k;
        for (i = 0; i < s1.length(); i++) {
            if (s2.charAt(i) != s1.charAt(index)) {
                return false;
            }
            index = (index + 1) % s1.length();
        }

        // System.out.println(i);
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abacd";
        String s2 = "bacda";

        if (s1.length() != s2.length()) {
            System.out.println("S2 is not rotation of s1");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(0) == s2.charAt(i)) {
                list.add(i);
            }
        }

        // System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (isRotated(s1, s2, list.get(i))) {
                System.out.println("s2 is a rotation of s1");
                return;
            }
        }

        System.out.println("S2 is not rotation of s1");

    }
}
