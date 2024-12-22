package zoho;

public class pattern {

    public static String count(int n) {
        if (n <= 0) {
            return "";
        }

        String s = "1";
        System.out.println(s);

        for (int i = 1; i < n; i++) {
            s = print(s);
            System.out.println(s);
        }
        return s;
    }

    public static String print(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i));
                // System.out.println(sb);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        count(5);
    }
}
