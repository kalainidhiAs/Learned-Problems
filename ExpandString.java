package zoho;

public class ExpandString {

    public static void print(char ch, int num) {
        if (num != 0) {
            while (num > 0) {
                System.out.print(ch);
                num--;
            }
        }
    }

    public static void main(String[] args) {
        String s = "a11b60c5d41";
        char ch = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                ch = s.charAt(i);
                continue;
            }

            int num = 0;
            int j = i;

            while (Character.isDigit(s.charAt(j))) {
                num += num * 10 + (s.charAt(i) - '0');
                if (j == s.length() - 1) {
                    print(ch, num);
                    break;
                }
                j++;

            }

            print(ch, num);

        }
    }
}
