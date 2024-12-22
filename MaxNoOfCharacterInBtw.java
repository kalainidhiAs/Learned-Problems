package zoho;

public class MaxNoOfCharacterInBtw {
    public static int countInBtw(String s) {
        int max_len = 0;
        for (int i = 0; i < s.length(); i++) {
            // System.out.println("i " + i);
            for (int j = s.length() - 1; j >= 0 + i; j--) {
                // System.out.println(j);
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    System.out.println(s.charAt(i) + " " + i);
                    System.out.println(s.charAt(j) + " " + j);
                    int len = j - i - 1;
                    max_len = Math.max(max_len, len);
                    // System.out.println(max_len - 1);
                }
            }
        }
        return max_len != 0 ? max_len : 0;
    }

    public static void main(String[] args) {
        String s = "WfQUWNOVrKPEGxPRYtwyycp";
        System.out.println(countInBtw(s));
    }
}
