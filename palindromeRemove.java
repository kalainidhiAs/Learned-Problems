package zoho;

public class palindromeRemove {
    public static void print(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (!isPalin(str[i])) {
                sb.append(str[i]);
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }

    public static boolean isPalin(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "He did a good deed";
        print(s);
        String s1 = "Hari speaks malayalam";
        print(s1);
    }
}
