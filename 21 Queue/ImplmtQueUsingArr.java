public class ImplmtQueUsingArr {

    public static class Queue {
        static int arr[];
        static int rear;
        static int size;

        Queue(int n) {
            arr = new int[n];
            rear = -1;
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full can't add item");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty can't remove item!");
                return -1;
            }

            int val = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty can't peek item!");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

// * TC
// add = O(1);
// remove = O(n)
