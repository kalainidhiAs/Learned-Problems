package zoho;

public class MaxSumOfContigiousSubArray {
    public static void findMax(int arr[]) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        int start = 0;
        int end = 0;
        int s = 0; // Start index of current subarray

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentSum + arr[i]) {
                s = i;
                currentSum = arr[i];
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = s;
                end = i;
            }
        }

        System.out.println("Maximum contiguous sum is " + maxSum);
        // System.out.println("Starting index: " + start);
        // System.out.println("Ending index: " + end);
        System.out.print("The contiguous subarray is: ");
        for (int j = start; j <= end; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        findMax(arr);
    }
}
