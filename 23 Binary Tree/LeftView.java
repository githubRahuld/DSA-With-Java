import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
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

    public static void leftView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        ArrayList<Node> ans = new ArrayList<>();

        while (!q.isEmpty()) {
            int size = q.size();
            ans.add(q.peek());

            while (size > 0) { // run for queue size times
                Node node = q.remove();

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                size--;
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i).data + " ");
        }

        // * for right view first push right node then left
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        leftView(root);
    }
}
