import java.util.ArrayList;

public class HeapBasics {

    static class MinHeap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int val) {

            // * step 1: add at last index in arr
            arr.add(val);

            // * step 2: check if newly added element(child) is smaller then parent then
            // swap till child move to its correct position

            int x = arr.size() - 1; // index of child
            int par = (x - 1) / 2; // index of parent

            while (arr.get(x) < arr.get(par)) { // O(logn)
                int temp = arr.get(par);
                arr.set(par, arr.get(x));
                arr.set(x, temp);

                x = par;
                par = (x - 1) / 2;
            }

        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            // check who is min among three of them(root, left ,right)
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            // if minIdx changes then agin

            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0); // value to be removed

            // * step 1: swap first and last ele
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // * step 2: remove last ele
            arr.remove(arr.size() - 1);

            // * step 3 :check again(heapify)
            // fix heap
            heapify(0);// in this , we find smaller ele then root

            return data;
        }

        boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        MinHeap pq = new MinHeap();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
