package zoho;

public class binToDec {
    public static void main(String[] args) {

        String str = "10001000";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        int res = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                // System.out.println(i);
                res += (int) Math.pow(2, i);

                System.out.println(res);
            }
        }

        System.out.println(res);
    }
}
