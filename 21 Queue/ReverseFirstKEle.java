import java.util.*;

public class ReverseFirstKEle {

    public static void reverseFirstKEle(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int n = q.size() - k;

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.peek());
            st.pop();
        }

        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int k = 5;
        reverseFirstKEle(q, k);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
// op: 50 40 30 20 10 60 70 80 90 100