package zoho;

import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");

        HashSet<String> set = new HashSet<>();
        for (String dup : banned) {
            set.add(dup);
        }

        String s[] = paragraph.toLowerCase().split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : s) {
            if (str != "") {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }

        }

        System.out.println(map);

        int max = Integer.MIN_VALUE;
        String res = "";
        for (String str : map.keySet()) {
            int val = map.get(str);
            if (val > max && !set.contains(str)) {
                max = val;
                res = str;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = { "bob", "hit" };
        System.out.println(new MostCommonWord().mostCommonWord(paragraph, banned));
    }
}
