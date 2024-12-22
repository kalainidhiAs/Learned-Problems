package zoho;

import java.util.Arrays;

public class waterTrapping {
    public static int trap(int arr[], int n) {
        int left[] = new int[n];
        int right[] = new int[n];

        int max = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            left[i] = max;
        }

        max = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            }
            right[i] = max;
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(left[i], right[i]) - arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        int n = arr.length; // output = 6
        System.out.println(trap(arr, n));
    }
}
