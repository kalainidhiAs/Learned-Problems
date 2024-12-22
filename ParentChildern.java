package zoho;

import java.util.*;

public class ParentChildern {
    public static String ArrayChallenge(String[] strArr) {
        Map<Integer, Integer> parentMap = new HashMap<>();
        Map<Integer, List<Integer>> childrenMap = new HashMap<>();
        Set<Integer> nodes = new HashSet<>();

        for (String pair : strArr) {
            String[] parts = pair.replace("(", "").replace(")", "").split(",");
            int child = Integer.parseInt(parts[0]);
            int parent = Integer.parseInt(parts[1]);
            parentMap.put(child, parent);
            nodes.add(child);
            nodes.add(parent);

            childrenMap.putIfAbsent(parent, new ArrayList<>());
            childrenMap.get(parent).add(child);
            if (childrenMap.get(parent).size() > 2) {
                return "false";
            }
        }
        // System.out.println(childrenMap);
        // System.out.println(parentMap);

        // System.out.println(nodes);

        int varOcg = -1;
        for (int node : nodes) {
            if (!parentMap.containsKey(node)) {
                if (varOcg == -1) {
                    varOcg = node;
                } else {
                    return "false";
                }
            }
        }

        // System.out.println(varOcg);

        if (varOcg == -1) {
            return "false"; // No root found
        }

        // Ensure there are no cycles (DFS to check for cycles)
        Set<Integer> visited = new HashSet<>();
        if (hasCycle(varOcg, childrenMap, visited)) {
            return "false";
        }
        return "true";
    }

    private static boolean hasCycle(int node, Map<Integer, List<Integer>> childrenMap, Set<Integer> visited) {
        if (visited.contains(node)) {
            return true;
        }
        visited.add(node);
        if (childrenMap.containsKey(node)) {
            for (int child : childrenMap.get(node)) {
                if (hasCycle(child, childrenMap, visited)) {
                    return true;
                }
            }
        }
        visited.remove(node);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ArrayChallenge(new String[] { "(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)" })); // Output:
        // true
        // System.out.println(ArrayChallenge(new String[] { "(1,2)", "(3,2)", "(2,12)",
        // "(5,2)" })); // Output: false
    }
}
