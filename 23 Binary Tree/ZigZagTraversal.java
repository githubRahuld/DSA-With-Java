import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class ZigZagTraversal {

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

    public static void zigzagTraversal(Node root) {
        if (root == null) {
            return;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        int f = 1;
        while (!q.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            int size = q.size();

            while (size > 0) {
                Node node = q.remove();

                temp.add(node.data);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                size--;
            }
            if (f % 2 == 0) { // only reverse odd even row
                Collections.reverse(temp);
            }
            for (int i = 0; i < temp.size(); i++) {
                ans.add(temp.get(i));
            }
            if (f == 1) {
                f = 0;
            } else {
                f = 1;
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
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

        zigzagTraversal(root);
    }
}
