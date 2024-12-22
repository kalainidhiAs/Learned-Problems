package zoho;

public class NumberGreater {
    public static void main(String[] args) {
        int arr[] = { 12, 6, 18, 22, 15, 8 };

        int j = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= j) {
                System.out.print(arr[i] + " ");
                j = arr[i];
            }
        }
    }
}
