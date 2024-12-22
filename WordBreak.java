package zoho;

public class WordBreak {
    public static boolean isPresent(String dict[], String s) {
        StringBuilder sb = new StringBuilder();
        for (String str : dict) {
            sb.append(str);
        }

        System.out.println(sb);
        for (int i = 0; i < sb.length() - s.length() + 1; i++) {
            String substr = sb.substring(i, i + s.length());
            if (substr.equals(s)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String dictionary[] = { "i", "like", "sam", "sung", "samsung", "mobile" };
        String s = "ilike";
        System.out.println(isPresent(dictionary, s));
    }
}
