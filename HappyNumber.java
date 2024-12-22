package zoho;

import java.util.*;;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n < 10 && n != 1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();

        while (true) {
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }
            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }

    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(21));
    }
}
