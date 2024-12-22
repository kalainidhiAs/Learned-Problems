package zoho;

import java.util.*;

class NumberWeight {
    int number;
    int weight;

    NumberWeight(int number, int weight) {
        this.number = number;
        this.weight = weight;
    }
}

public class NumberWeightSort {
    public static void main(String[] args) {
        int numbers[] = { 10, 36, 89, 54, 12, 25 };

        List<NumberWeight> numberWeights = new ArrayList<>();
        for (int num : numbers) {
            int weight = calculate_weight(num);
            numberWeights.add(new NumberWeight(num, weight));
        }
        // System.out.println(numberWeights);

        Collections.sort(numberWeights, Comparator.comparingInt(k -> k.weight));

        System.out.print("<");
        for (int i = 0; i < numberWeights.size(); i++) {
            NumberWeight k = numberWeights.get(i);
            System.out.print(k.number + "," + k.weight);
            if (i < numberWeights.size() - 1) {
                System.out.print(">,<");
            }
        }
        System.out.println(">");
    }

    public static int calculate_weight(int num) {
        if (isPerfectSquare(num)) {
            return 5;
        } else if (num % 4 == 0 && num % 6 == 0) {
            return 4;
        } else if (num % 3 == 0) {
            return 3;
        }
        return 0;
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        System.out.println(sqrt);
        return sqrt * sqrt == num;
    }
}