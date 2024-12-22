package zoho;

public class atoi {
    static int atoinumber(String s) {
        int r = 0;
        int sign = 1;

        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        }

        for (; i < s.length(); i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                r = r * 10 + s.charAt(i) - '0';
            } else {
                return -1;
            }

        }
        return r * sign;
    }

    public static void main(String[] args) {
        String s = "-1235";
        System.out.println(atoinumber(s));
    }
}
