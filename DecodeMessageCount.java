package zoho;

public class DecodeMessageCount {
    static int MOD = 1000000007;

    public static int CountWays(String str) {

        if (str.length() == 0) {
            return 0;
        }

        long arr[] = new long[str.length() + 1];
        arr[0] = 1;
        arr[1] = str.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= str.length(); i++) {
            int oned = Integer.parseInt(str.substring(i - 1, i));
            // System.out.println(oned);
            int twod = Integer.parseInt(str.substring(i - 2, i));
            System.out.println(twod);

            if (oned >= 1 && oned <= 9) {
                arr[i] = (arr[i] + arr[i - 1]) % MOD;
            }

            if (twod >= 10 && twod <= 26) {
                arr[i] = (arr[i] + arr[i - 2]) % MOD;
            }
        }
        return (int) arr[str.length()];
    }

    public static void main(String[] args) {
        String input = "1254378";
        int n = CountWays(input);
        System.out.println(n); // Should output 345885570
    }
}
