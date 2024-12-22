package zoho;

//import java.util.*;
import java.util.*;

public class frequencySort {
    public static void sort(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int freq = map.get(b).compareTo(map.get(a));
                if (freq == 0) {
                    return a.compareTo(b);
                } else {
                    return freq;
                }
            }
        });

        for (int i : list) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 7, 6, 4, 5, 5 }; // 5 5 5 4 4 7 6
        sort(arr);
    }
}
