public class KthSmallest {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int count = 0;

    public static Node kthSmallest(Node root, int k) {
        if (root == null)
            return null;

        Node left = kthSmallest(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }

        return kthSmallest(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        Node kthsmallest = kthSmallest(root, 2);
        System.out.println(kthsmallest.data);
    }
}
