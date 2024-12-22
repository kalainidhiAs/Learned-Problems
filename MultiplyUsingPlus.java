package zoho;

public class MultiplyUsingPlus {
    public static void main(String[] args) {
        int x = 9;
        int y = 7;

        int res = 0;
        for (int i = 0; i < y; i++) {
            res += x;
        }
        System.out.println(res);
    }
}
