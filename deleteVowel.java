package zoho;

import java.util.Scanner;

public class deleteVowel {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        char arr[] = str.toCharArray();
        String a = "";

        if (!isVowel(arr[0])) {
            a += arr[0];
        }

        for (int i = 1; i < arr.length; i++) {
            if (isVowel(arr[i]) && isVowel(arr[i - 1])) {
                a += arr[i - 1] + "" + arr[i];
            }
            if (!isVowel(arr[i])) {
                a += arr[i];
            }
        }
        System.out.println(a);

    }
}
