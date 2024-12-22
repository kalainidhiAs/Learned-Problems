package zoho;

public class currencyNote {
    public static void countCurrency(int amount) {
        int notes[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int noteCounter[] = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            // System.out.println(i);
            // System.out.println(amount);

            while (amount >= notes[i]) {
                noteCounter[i]++;
                amount -= notes[i];

            }
            // System.out.println(notes[i] + " " + noteCounter[i]);
        }

        for (int i = 0; i < noteCounter.length; i++) {
            if (noteCounter[i] > 0) {
                System.out.println(notes[i] + ": " + noteCounter[i]);
            }
        }
    }

    public static void main(String[] args) {
        int amount = 12345;
        countCurrency(amount);
    }
}
