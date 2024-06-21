import java.util.Stack;

public class ImpltQueUsingTwoStack {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int val) {
            // 1 push all ele from s1 to s2 jab tak s1 empty na ho jaye
            // 2 add new ele in s1
            // 3 transfer ele from s2 to s1

            while (!s1.isEmpty()) {
                s2.push(s1.peek());
                s1.pop();
            }

            s1.push(val);

            while (!s2.isEmpty()) {
                s1.push(s2.peek());
                s2.pop();
            }

        }

        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int val = s1.peek();
            s1.pop();
            return val;
        }

        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.peek();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
