package zoho;

public class distance {
    public static int find_distance(int arr[]) {
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (i != j && arr[i] == arr[j] && i <= j) {
                    // System.out.println(arr[i] + " " + arr[j]);
                    int len = j - i;
                    // System.out.println(len);
                    minLen = Math.min(minLen, len);
                }
                // System.out.println(minLen + " " + len);

            }

        }
        // System.out.println(minLen);
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 4, 1, 2, 3, 4, 1, 7 };
        int n = find_distance(arr);
        System.out.println(n);
    }
}
