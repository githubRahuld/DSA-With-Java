import java.util.ArrayList;
import java.util.PriorityQueue;

public class SlidingWindMax {

    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            // return this.val - p2.val; // acending

            // decending
            return p2.val - this.val;
        }
    }

    public static void slidingWindowMax(int arr[], int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // maxHeap
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        // add k ele in pq
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res.add(pq.peek().val);

        for (int i = k; i < arr.length; i++) {

            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res.add(pq.peek().val);
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        slidingWindowMax(arr, k); // O(nlogK)

        // effiecient way using Deque O(n)
    }
}
