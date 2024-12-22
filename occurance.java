package zoho;

import java.util.*;;

public class occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        in.close();

        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i) - 'a'] > 0) {
                System.out.print(str.charAt(i) + "" + arr[str.charAt(i) - 'a']);
                arr[str.charAt(i) - 'a'] = 0;
            }
        }
    }
}
