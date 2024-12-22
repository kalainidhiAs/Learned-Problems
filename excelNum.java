package zoho;

public class excelNum {
    public static int excelColumnNumber(String s) {
        // Code here
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans *= 26;
            ans += s.charAt(i) - 'A' + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aa";
        System.out.println(excelColumnNumber(s));
    }
}
