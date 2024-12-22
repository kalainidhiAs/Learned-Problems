package zoho;

import java.util.*;

public class NextGreater {

    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        Stack<Integer> s = new Stack<>();
        long res[] = new long[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            while (!s.empty() && arr[i] > arr[s.peek()]) {
                res[s.pop()] = arr[i];
                System.out.println(s);
                System.out.println(Arrays.toString(res));
            }
            s.push(i);

        }

        return res;
    }

    public static void main(String[] args) {
        long arr[] = { 1, 3, 2, 4 };
        int n = arr.length;
        long[] res = nextLargerElement(arr, n);
        System.out.println(Arrays.toString(res));
    }
}