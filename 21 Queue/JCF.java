import java.util.*;

public class JCF {
    public static void main(String[] args) {
        // queue is a interface so we can't make object of it
        // queue can be implmted using linkedlist or ArrayDeque

        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
