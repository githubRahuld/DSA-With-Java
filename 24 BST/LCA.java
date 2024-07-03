public class LCA {
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

    public static Node lca(Node root, int n1, int n2) {
        if (root == null)
            return null;

        if (root.data > n1 && root.data > n2) {
            return lca(root.left, n1, n2);
        } else if (root.data < n1 && root.data < n2) {
            return lca(root.right, n1, n2);
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(9);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.left = new Node(10);
        root.right.right.right = new Node(14);

        Node lca = lca(root, 1, 4);
        System.out.println(lca.data);
    }
}
