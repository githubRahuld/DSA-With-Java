public class MinInBST {
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

    public static int minInBST(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.left != null) {
            return minInBST(root.left);
        }
        return root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        int min = minInBST(root);
        System.out.println(min);
    }
}
