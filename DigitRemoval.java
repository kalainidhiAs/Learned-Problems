package zoho;

import java.util.Scanner;

public class DigitRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the N value: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int[] hash = new int[100]; // Assuming numbers are within 0-99
        int count = n;

        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            hash[array[i]]++;
        }

        while (count != 0) {
            System.out.print("Enter the digit: ");
            int digit = scanner.nextInt();

            if (hash[digit] != 0) {
                count -= hash[digit];
                hash[digit] = 0;
                System.out.println("Digit " + digit + " removed successfully");
            } else {
                System.out.println("No digit found, Please enter the digit");
            }

            System.out.print("[");
            for (int i = 0; i < n; i++) {
                if (hash[array[i]] != 0) {
                    System.out.print(array[i] + ",");
                }
            }
            System.out.println("]");
        }

        scanner.close();
    }
}
