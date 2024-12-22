package zoho;

import java.util.Arrays;

public class MaxArrayReverse {
    public static void reversedArray(int arr[], int max) {
        for (int i = 0; i < arr.length; i++) {
            int n = reverse(arr[i], max);
            arr[i] = n;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static int reverse(int n, int max) {
        int reversed = 0;
        int len = 0;
        while (n != 0) {
            int rem = n % 10;
            len++;
            reversed = reversed * 10 + rem;
            n /= 10;
        }

        if (len == max) {
            return reversed;
        } else {
            while (len != max) {
                reversed = reversed * 10;
                len++;
            }
            return reversed;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 70, 15, 118 };
        int max = 3;
        reversedArray(arr, max);
    }
}