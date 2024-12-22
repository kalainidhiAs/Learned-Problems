package zoho;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                list.add(arr[deque.peekFirst()]);
            }
        }

        System.out.println(list);
    }
}
