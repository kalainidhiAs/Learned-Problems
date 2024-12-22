package zoho;

public class palin {
    public static void main(String[] args) {
        String s = "baab";
        // System.out.println(Character.isLetterOrDigit(s.charAt(0)));
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("fasle");
                return;
            }
            i++;
            j--;
        }
        System.out.println("true");
    }
}
