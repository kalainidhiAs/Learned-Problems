package zoho;

public class version {
    public static void main(String[] args) {
        String v1 = "1.02.09";
        String v2 = "1.02";

        String a[] = v1.split("\\.");
        String b[] = v2.split("\\.");
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));

        int len = Math.min(a.length, b.length);

        for (int i = 0; i < len; i++) {
            int x = Integer.parseInt(a[i]);
            int y = Integer.parseInt(b[i]);

            // System.out.println(x);
            // System.out.println(y);

            if (x == y) {
                continue;
            } else if (x < y) {
                System.out.println(1);
                return;
            } else if (x > y) {
                System.out.println(-1);
                return;
            }
        }
        if (a.length > b.length) {
            int x = Integer.parseInt(a[a.length - 1]);
            if (x > 0) {
                System.out.println(-1);
                return;
            }
        } else if (a.length < b.length) {
            int x = Integer.parseInt(b[b.length - 1]);
            if (x > 0) {
                System.out.println(1);
                return;
            }

            System.out.println(0);
        }
    }
}