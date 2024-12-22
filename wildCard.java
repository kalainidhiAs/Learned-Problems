package zoho;

public class wildCard {
    public static boolean isMatch(String s, String p) {
        int i = 0, j = 0, start = -1, match = 0;
        while (i < s.length()) {
            if (j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                start = j;
                match = i;
                j++;
            } else if (start != -1) {
                j = start;
                match++;
                i = match;
            } else {
                return false;
            }
        }

        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }

        return j == p.length();
    }

    public static void main(String[] args) {
        String s = "poornas";
        String p = "p*p";
        System.out.println(isMatch(s, p));
    }
}
