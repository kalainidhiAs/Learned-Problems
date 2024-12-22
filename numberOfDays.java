package zoho;

public class numberOfDays {
    // code here
    static int findDayBetweenYear(int y1, int y2) {
        int days = 0;
        for (int i = y1; i < y2; i++) {
            days += YearToDays(i);
            // System.out.println(days);
        }
        return days;
    }

    static int YearToDays(int y) {
        if (isLeap(y)) {
            return 366;
        }
        return 365;
    }

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int monthToday(int m, int y) {
        int arr[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int sum = 0;
        for (int i = 1; i < m; i++) {
            if (isLeap(y) && i == 2) {
                sum++;
            }
            sum += arr[i];
        }
        return sum;
    }

    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        // code here
        if (y2 < y1) {
            return noOfDays(d2, m2, y2, d1, m1, y1);
        }

        int total = findDayBetweenYear(y1, y2);
        // System.out.println(total);
        total -= (d1 + monthToday(m1, y1));
        total += (d2 + monthToday(m2, y2));

        return total < 0 ? -total : total;
    }

    public static void main(String[] args) {
        int d1 = 11, m1 = 3, y1 = 1038;
        int d2 = 1, m2 = 7, y2 = 962;
        System.out.println(noOfDays(d1, m1, y1, d2, m2, y2));
    }
}
