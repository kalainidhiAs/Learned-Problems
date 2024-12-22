package zoho;

import java.util.Arrays;

public class AddIfSame {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8 };

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] + arr[i + 1];
                arr[i + 1] = 0;
            }
        }

        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
                arr[i] = 0;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
