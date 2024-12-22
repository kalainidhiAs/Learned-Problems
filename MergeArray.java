package zoho;

import java.util.ArrayList;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 5, 6, 7, 8, 10, 13 };
        int arr2[] = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };

        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            list.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            list.add(arr2[j]);
            j++;
        }

        System.out.println(list);
    }
}
