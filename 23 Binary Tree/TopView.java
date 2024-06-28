import java.util.*;

public class TopView {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Pair {
        Node node;
        int hd; // horizontal distance

        public Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {

        Queue<Pair> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0; // for printing final map
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.remove();

            int hd = curr.hd; // line
            Node node = curr.node; // value

            if (!map.containsKey(hd)) { // first time occuring
                map.put(hd, node);
            }

            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
                min = Math.min(min, hd - 1);
            }
            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
                max = Math.max(max, hd + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}
