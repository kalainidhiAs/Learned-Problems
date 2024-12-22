package zoho;

import java.util.*;

public class FrequencySortQueue {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int i : map.keySet()) {
            queue.add(i);
        }

        System.out.println(queue);

        int k = 0;
        while (queue.size() > 0) {
            int i = queue.remove();

            for (int j = 0; j < map.get(i); j++) {
                // System.out.println(map.get(i));
                nums[k++] = i;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 1, 4, 1, 1, 3 };
        int resultt[] = frequencySort(arr);
        System.out.println(Arrays.toString(resultt));
    }
}
