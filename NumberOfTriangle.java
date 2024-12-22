package zoho;

import java.util.*;

public class NumberOfTriangle {
    static int findNumberOfTriangles(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] > arr[i]) {
                    count += (r - l);
                    r--;
                } else {
                    l++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 9, 7, 8 };
        int n = arr.length;
        System.out.println(findNumberOfTriangles(arr, n));
    }
}
