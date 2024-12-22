package zoho;

public class inorderTraversal {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 1; i < arr.length - 1; i += 3) {
            System.out.print(arr[i] + " ");
            System.out.print(arr[i - 1] + " ");
            System.out.print(arr[i + 1] + " ");
        }
    }
}
