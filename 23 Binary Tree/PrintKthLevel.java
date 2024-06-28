import java.util.*;

public class PrintKthLevel {

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

    // iterative way using level order traversal
    public static void printKthLevel(Node root, int k) {

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        int level = 1;
        while (!q.isEmpty()) {
            Node node = q.remove();

            if (node != null) { // if not is not null

                if (level == k) {
                    System.out.print(node.data + " ");
                }

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            } else if (!q.isEmpty()) { // means que is not empty but level end
                level++;
                q.add(null);
            }

        }
    }

    // recursive way
    public static void kLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }

        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;
        printKthLevel(root, k);

        System.out.println();

        // recursive way
        kLevel(root, 1, k);
    }
}
