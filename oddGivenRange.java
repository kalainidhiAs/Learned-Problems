package zoho;

import java.util.*;

public class oddGivenRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
