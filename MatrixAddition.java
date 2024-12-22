package zoho;

import java.util.Arrays;

public class MatrixAddition {
    public int matrixSum(int[][] nums) {
        for (int arr[] : nums) {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        // System.out.println(Arrays.deepToString(nums));

        int sum = 0;
        for (int j = nums[0].length - 1; j >= 0; j--) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i][j]);
            }
            sum += max;
        }

        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = { { 7, 2, 1 }, { 6, 4, 2 }, { 6, 5, 3 }, { 3, 2, 1 } };
        System.out.println(new MatrixAddition().matrixSum(mat));
    }
}
