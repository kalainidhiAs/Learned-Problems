package zoho;

import java.util.*;

public class DigitFind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int len = (n == 0) ? 1 : (int) Math.log10(n) + 1;
        System.out.println(len);
        in.close();
    }
}
