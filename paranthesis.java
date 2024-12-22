package zoho;

public class paranthesis {
    public static boolean checkParanthesis(String str) {
        int open = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                open++;
            } else {
                open--;
            }
        }
        if (open == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(()())(";
        System.out.println(checkParanthesis(str));
    }
}
