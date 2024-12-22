package zoho;

import java.util.Scanner;

public class AdditionInMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the size: ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("enter the size of array[" + i + "] index: ");
            int arraySize = in.nextInt();
            int numArr[] = new int[arraySize];

            System.out.println("enter " + arraySize + " values: ");
            for (int j = 0; j < arraySize; j++) {
                numArr[j] = in.nextInt();
            }

            int num = 0;
            for (int k = 0; k < arraySize; k++) {
                num = num * 10 + numArr[k];
            }

            sum += num;
            // System.out.println(sum);

        }

        System.out.println(sum);
        in.close();
    }
}
