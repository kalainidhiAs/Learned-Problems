package zoho;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "hi i am kalainidh ";
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                // System.out.println("hi");
                len++;
            } else if (s.charAt(i) == ' ' && len != 0) {
                break;
            }
        }

        System.out.println(len);
    }
}
