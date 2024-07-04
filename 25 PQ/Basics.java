import java.util.Collections;
import java.util.PriorityQueue;

public class Basics {
    public static void main(String[] args) {
        // * accending */
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // * decending */
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(3);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }

}