package zoho;

import java.util.*;

public class addSingleDigit {
    public static int add(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum > 10 ? add(sum) : sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(add(num));
        in.close();
    }
}
