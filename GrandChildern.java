package zoho;

import java.util.Map.Entry;

import java.util.*;

public class GrandChildern {
    private static int countGrandChildern(String[][] relationships, String ancestor) {
        // parent child map
        Map<String, List<String>> parentChildMap = new HashMap<>();
        for (String[] relationship : relationships) {
            String child = relationship[0];
            String parent = relationship[1];
            if (!parentChildMap.containsKey(parent)) {
                List<String> childern = new ArrayList<>();
                childern.add(child);
                parentChildMap.put(parent, childern);
            } else {
                parentChildMap.get(parent).add(child);
            }
        }

        int grandChildernCount = 0;
        List<List<String>> parents = new ArrayList<>();
        for (Entry<String, List<String>> entry : parentChildMap.entrySet()) {
            if (entry.getKey() == ancestor) {
                parents.add(entry.getValue());
            }
        }

        for (List<String> st : parents) {
            for (String s : st) {
                List<String> grandChild = parentChildMap.get(s);
                if (grandChild != null) {
                    grandChildernCount += grandChild.size();
                }
            }
        }

        return grandChildernCount;
    }

    public static void main(String[] args) {
        String[][] relationships = {
                { "luke", "shaw" },
                { "wayne", "rooney" },
                { "rooney", "ronaldo" },
                { "shaw", "rooney" },
                { "vishnu", "ronaldo" },
                { "vijaySuriya", "vishnu" }
        };

        String ancestor = "ronaldo";
        int grandChildren = countGrandChildern(relationships, ancestor);
        System.out.println(grandChildren);
    }
}
