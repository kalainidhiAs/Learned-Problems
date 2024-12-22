package zoho;

import java.util.*;

public class FreqChar {
    public static void main(String[] args) {
        String s = "abaabccded";
        char ch = 'a';
        char c[] = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] != c[i + 1]) {
                map.put(c[i], map.getOrDefault(c[i], 0) + 1);
            }
        }

        map.put(c[c.length - 1], map.getOrDefault(c[c.length - 1], 0) + 1);
        System.out.println(map.get(ch));
    }
}
