package zoho;

import java.util.*;

public class addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of 1st digit: ");
        int n1 = in.nextInt();
        int a[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("enter the size of 2nd digit: ");
        int n2 = in.nextInt();
        int b[] = new int[n2];
        for (int j = 0; j < n2; j++) {
            b[j] = in.nextInt();
        }

        int maxLen = Math.max(n1, n2);
        int carry = 0;
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < maxLen || carry == 1; i++) {
            int d1 = i < n1 ? a[n1 - i - 1] : 0;
            int d2 = i < n2 ? b[n2 - i - 1] : 0;
            int sum = d1 + d2 + carry;
            list.add(0, sum % 10);
            carry = sum / 10;
        }

        System.out.println(list);
        in.close();

    }
}
