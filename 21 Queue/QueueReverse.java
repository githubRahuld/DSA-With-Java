import java.util.*;

public class QueueReverse {

    public static void queReverse(Queue<Integer> q) {

        Stack<Integer> st = new Stack<>();

        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        queReverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
