package zoho;

public class CapitalToSmall {
    public static void main(String[] args) {
        String a = "poor";
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                b.append((char) (a.charAt(i) - 32));
            } else {
                b.append(a.charAt(i));
            }
        }
        System.out.println(b.toString());
    }
}
