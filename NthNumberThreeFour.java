package zoho;

public class NthNumberThreeFour {
    public static void main(String[] args) {
        int n = 10;

        n--;

        StringBuilder sb = new StringBuilder();

        while (n >= 0) {
            int rem = n % 2;
            sb.append(rem == 0 ? "3" : "4");
            n = n / 2 - 1;
        }

        System.out.println(sb.reverse());
    }
}
