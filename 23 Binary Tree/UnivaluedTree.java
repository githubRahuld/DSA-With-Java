public class UnivaluedTree {
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

    public static boolean checkUnivaluedTree(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.data != root.left.data) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.data != root.right.data) {
                return false;
            }
        }

        return checkUnivaluedTree(root.left) && checkUnivaluedTree(root.right);
    }

    public static void main(String[] args) {

        // univalued tree : means all nodes in tree have same value

        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(5);

        System.out.println(checkUnivaluedTree(root));
    }
}
