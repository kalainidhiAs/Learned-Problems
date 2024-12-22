package zoho;

//import java.util.*;

public class alphaNumber {
    public static void print(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder nb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // System.out.println(i);
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(c);
                // System.out.println(sb.toString());
            } else if (Character.isDigit(c)) {
                if (Character.isDigit(c) && Character.isLetter(s.charAt(i + 1)) && i != s.length()) {
                    nb.append(c);
                    // System.out.println(1234);
                    // System.out.println(sb.charAt(count));
                    printLetter(sb.charAt(count), nb.toString());
                    count = 0;
                    sb.setLength(0);
                    nb.setLength(0);
                } else if (Character.isDigit(c)) {
                    nb.append(c);
                }
            }

        }
    }

    public static void printLetter(char c, String s) {
        int n = Integer.parseInt(s);
        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String s = "a10b5c12n1n";
        print(s);
    }
}
