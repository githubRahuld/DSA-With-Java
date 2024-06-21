import java.util.*;

public class DequeJCF {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        System.out.println(q); // 2 1

        q.addLast(3);
        q.addLast(4);
        System.out.println(q); // 2 1 3 4

        q.removeFirst();
        System.out.println(q); // 1 3 4

        q.removeLast();
        System.out.println(q); // 1 3

        System.out.println(q.peekFirst()); // 1
        System.out.println(q.peekLast()); // 3
    }
}
