package zoho;

import java.util.Arrays;
import java.util.HashSet;

public class DistictNumber {
    public static int[] common_digits(int[] nums) {
        // code here
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            String a = Integer.toString(nums[i]);
            System.out.println(i);
            for (int j = 0; j < a.length(); j++) {
                set.add(a.charAt(j));
            }

        }
        // System.out.println(set);
        int arr[] = new int[set.size()];
        int i = 0;
        for (Character d : set) {
            arr[i++] = Character.getNumericValue(d);
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 111, 222, 333, 4444, 666 };
        System.out.println(Arrays.toString(common_digits(arr)));
    }
}
