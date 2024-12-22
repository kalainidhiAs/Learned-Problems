package zoho;

import java.util.*;

public class MoveZeroToEnd {
    static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int l = 0, r = n - 1;

        while (l < r) {
            while (arr[l] != 0) {
                l++;
                if (l == r) {
                    break;
                }
            }

            while (arr[r] == 0) {
                r--;
            }

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 2 };
        int n = arr.length;
        pushZerosToEnd(arr, n);
    }
}
