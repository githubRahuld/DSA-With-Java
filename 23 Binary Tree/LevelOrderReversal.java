import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderReversal {

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

    public static void levelOrderReversal(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        ArrayList<Integer> ans = new ArrayList<>();

        while (!q.isEmpty()) {
            Node node = q.remove();

            if (node != null) {
                ans.add(node.data);

                if (node.right != null) { // * thing to remember(right first)
                    q.add(node.right);
                }
                if (node.left != null) {
                    q.add(node.left);
                }
            } else if (!q.isEmpty()) {
                q.add(null);
            }

        }
        Collections.reverse(ans); // reverse ArrayList

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

        levelOrderReversal(root);
    }
}
