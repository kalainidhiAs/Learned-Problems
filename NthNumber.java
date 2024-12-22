package zoho;

import java.util.LinkedList;
import java.util.Queue;

//3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….
public class NthNumber {
    public static void main(String[] args) {
        int n = 10;

        Queue<String> q = new LinkedList<>();
        q.add("3");
        q.add("4");
        int count = 0;
        while (!q.isEmpty() && count < n) {
            String cur = q.poll();
            System.out.print(cur + " ");
            count++;

            q.add(cur + "3");
            q.add(cur + "4");
        }
    }
}
