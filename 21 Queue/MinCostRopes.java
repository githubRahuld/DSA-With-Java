import java.util.*;

public class MinCostRopes {
    static int minCost(int arr[], int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // * accending
        // * decending
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);

        }
        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            // System.out.println("Result: " + res);
            pq.add(first + second);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        int n = arr.length;

        System.out.println(minCost(arr, n));
    }
}
