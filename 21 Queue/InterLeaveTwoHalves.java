import java.util.*;

public class InterLeaveTwohalves {
    public static void interleaveTwoHalves(Queue<Integer> q) {

        Queue<Integer> temp = new LinkedList<>();

        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            temp.add(q.peek());
            q.remove();
        }

        while (!temp.isEmpty()) {
            q.add(temp.remove());
            q.add(q.remove());
        }

        for (int i = 0; i < size; i++) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleaveTwoHalves(q);

    }

}
// 1 6 2 7 3 8 4 9 5 10
