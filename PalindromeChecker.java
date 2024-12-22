package zoho;

public class PalindromeChecker {

    public static void main(String[] args) {
        String str = "abc:;d0823} c:ba";
        System.out.println("Original string: " + str);
        System.out.println("Is palindrome: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {

        String newstr = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(newstr);

        for (int i = 0; i < newstr.length() / 2; i++) {
            if (newstr.charAt(i) != newstr.charAt(newstr.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
// "[^a-zA-Z]", ""