package zoho;

import java.util.HashMap;
import java.util.HashSet;

public class frequencyChec {
    static boolean sameFreq(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        int min = Integer.MAX_VALUE;

        for (char ch : map.keySet()) {
            // System.out.println(map.get(ch));
            if (!set.add(map.get(ch))) {
                set1.add(map.get(ch));

            } else {
                set.add(map.get(ch));
            }
            if (set1.size() > 1 || set.size() > 2) {
                return false;
            }
        }

        for (int a : set) {
            min = Math.min(a, min);
            if (min == 1) {
                return true;
            }
        }

        // System.out.println(min);

        for (int b : set1) {
            if (b != min) {
                return false;
            }
        }

        // System.out.println(set.size());
        return true;
    }

    public static void main(String[] args) {
        String s = "xxyyz";
        System.out.println(sameFreq(s));
    }
}
