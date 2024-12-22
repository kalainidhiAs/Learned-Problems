package zoho;

import java.util.Arrays;

public class ModifyArray {
    public static void arrange(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i] && arr[i - 1] != 0) {
                arr[i - 1] = arr[i - 1] * 2;
                arr[i] = 0;
            }
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 0, 4, 0, 8 };
        arrange(arr);
    }
}
