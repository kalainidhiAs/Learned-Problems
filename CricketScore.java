package zoho;

public class CricketScore {
    public static void Score(String s) {
        int p1 = 0, p2 = 0, extra = 0;
        boolean player1 = true, player2 = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && player1) {
                if ((s.charAt(i) - '0') % 2 != 0) {
                    player1 = false;
                    player2 = true;
                }
                p1 += s.charAt(i) - '0';
                System.out.println("p1 " + p1);
            } else if (Character.isDigit(s.charAt(i)) && player2) {
                if ((s.charAt(i) - '0') % 2 != 0) {
                    player2 = false;
                    player1 = true;
                }
                p2 += s.charAt(i) - '0';
                System.out.println("p2 " + p2);
            } else if (Character.isAlphabetic(s.charAt(i))) {
                extra += 1;
            } else if (s.charAt(i) == '.') {
                continue;
            }
        }

        System.out.println("Player 1: " + p1);
        System.out.println("Player 2: " + p2);
        System.out.println("Extras : " + extra);
    }

    public static void main(String[] args) {
        String s = "1.2.436W1.N.21";
        Score(s);
    }
}
