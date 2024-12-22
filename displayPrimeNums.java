package zoho;

import java.util.Scanner;

public class displayPrimeNums {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i < Math.sqrt(num); i++) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        in.close();

        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i])) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
