package zoho;

public class circularTour {
    static int tour(int petrol[], int distance[]) {
        // Your code here
        // int pet = 0;
        // int dis = 0;

        int balance = 0;
        int start = 0;
        int total = 0;

        for (int i = 0; i < petrol.length; i++) {
            balance += petrol[i] - distance[i];
            total += petrol[i] - distance[i];
            if (balance < 0) {
                balance = 0;
                start = i + 1;
            }
        }

        return total >= 0 ? start : -1;

    }

    public static void main(String[] args) {
        int petrol[] = { 62, 49, 8, 18, 98, 70, 39, 70, 40, 29, 71, 19, 93, 86, 43, 81, 34, 55, 44, 8, 51, 1, 86, 22,
                21, 89, 41, 91, 48, 35, 84, 26, 95 };
        // System.out.println(petrol.length);
        int distance[] = { 62, 31, 43, 64, 92, 21, 21, 39, 55, 93, 43, 23, 31, 86, 35, 95, 9, 9, 81, 3, 45, 85, 46, 88,
                23, 58, 26, 3, 36, 49, 93, 87, 97 };
        // System.out.println(distance.length);
        System.out.println(tour(petrol, distance));
    }
}

/*
 * int balance = 0;
 * int start = 0;
 * 
 * for (int i = 0; i < petrol.length; i++) {
 * 
 * // pet += petrol[i];
 * // dis += distance[i];
 * balance += petrol[i] - distance[i];
 * System.out.println(balance);
 * if (balance < 0) {
 * balance = 0;
 * start = i + 1;
 * }
 * 
 * }
 * 
 * for (int i = 0; i < start; i++) {
 * balance += petrol[i] - distance[i];
 * }
 * 
 * // System.out. println(balance);
 * // System.out.println(start);
 * return balance < 0 ? -1 : start;
 */