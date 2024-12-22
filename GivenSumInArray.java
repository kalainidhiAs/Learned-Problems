package zoho;

import java.util.*;

public class GivenSumInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 8, 8 };
        int sum = 9;

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        for (int i : arr) {
            int rem = 0;
            rem = sum - i;

            if (set.contains(rem)) {
                System.out.println("true");
                return;
            }
        }

        System.out.println("false");
    }
}
