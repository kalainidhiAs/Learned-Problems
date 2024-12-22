package zoho;

public class MaximumProduct {

    public int maximumProduct(int[] nums) {
        int maxp1 = Integer.MIN_VALUE, maxp2 = Integer.MIN_VALUE, maxp3 = Integer.MIN_VALUE;
        int minp1 = Integer.MAX_VALUE, minp2 = Integer.MAX_VALUE;

        for (int i : nums) {
            if (maxp1 <= i) {
                maxp3 = maxp2;
                maxp2 = maxp1;
                maxp1 = i;
            }

            if (maxp2 <= i && i < maxp1) {
                maxp3 = maxp2;
                maxp2 = i;
            }

            if (maxp3 <= i && i < maxp2) {
                maxp3 = i;
            }

            if (minp1 >= i) {
                minp2 = minp1;
                minp1 = i;
            }

            if (minp2 >= i && i > minp1) {
                minp2 = i;
            }
        }

        // System.out.println(maxp1);
        // System.out.println(maxp2);
        // System.out.println(maxp3);
        // System.out.println(minp1);
        // System.out.println(minp2);

        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        return Math.max(maxp1 * maxp2 * maxp3, minp1 * minp2 * maxp1);
    }

    public static void main(String[] args) {
        int nums[] = { -100, -98, -1, 2, 3, 4 };
        System.out.println(new MaximumProduct().maximumProduct(nums));
    }
}
/*
 * for (int ele : nums) {
 * if (maxp1 <= ele) {
 * maxp3 = maxp2;
 * maxp2 = maxp1;
 * maxp1 = ele;
 * }
 * if (maxp2 <= ele && ele < maxp1) {
 * maxp3 = maxp2;
 * maxp2 = ele;
 * }
 * if (maxp3 <= ele && ele < maxp2) {
 * maxp3 = ele;
 * }
 * if (minp1 >= ele) {
 * minp2 = minp1;
 * minp1 = ele;
 * }
 * if (minp2 >= ele && ele > minp1) {
 * minp2 = ele;
 * }
 * }
 * return Math.max(maxp1 * maxp2 * maxp3, minp1 * minp2 * maxp1);
 */