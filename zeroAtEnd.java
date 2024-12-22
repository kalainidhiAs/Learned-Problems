package zoho;

import java.util.*;

public class zeroAtEnd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int arr[] = new int[in.nextInt()];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = in.nextInt();

            if (x != 0) {
                arr[j++] = x;
            }
        }
        in.close();

        System.out.println(Arrays.toString(arr));

    }
}
