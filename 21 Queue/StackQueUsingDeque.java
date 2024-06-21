import java.util.*;

public class StackQueUsingDeque {

    static class Stack {
        static Deque<Integer> deque = new LinkedList<>();

        // push
        public static void push(int val) {
            deque.addLast(val);
        }

        // pop
        public static int pop() {
            return deque.removeLast();
        }

        // peek
        public static int peek() {
            return deque.peekLast();
        }
    }

    static class Queue {
        static Deque<Integer> deque = new LinkedList<>();

        // add
        public static void add(int val) {
            deque.addFirst(val);
        }

        // remove
        public static int remove() {
            return deque.removeLast();
        }

        // peek
        public static int peek() {
            return deque.peekLast();
        }
    }

    public static void main(String[] args) {

        // stack
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.peek());
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.println();

        // queue
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.print(q.remove() + " ");
        System.out.print(q.remove() + " ");
        System.out.print(q.remove());
    }
}
