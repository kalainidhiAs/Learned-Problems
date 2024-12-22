package zoho;

public class MaxiWindow {
    public static void maxNum(int arr[], int k) {
        for (int i = 0; i < arr.length - 2; i++) {
            System.out.print(findMax(arr[i], arr[i + 1], arr[i + 2]) + " ");
        }
    }

    public static int findMax(int a, int b, int c) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (c > a) {
            int temp = c;
            c = a;
            a = temp;
        }

        // System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 1, 8, 6, 9 };
        int k = 3;
        maxNum(arr, k);
    }
}
