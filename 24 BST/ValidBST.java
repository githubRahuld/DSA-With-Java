public class ValidBST {
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

    public static boolean isValidBST(Node root, Node min, Node max) {
        // we will check is every node come within range (min,max)
        if (root == null)
            return true;

        if (min != null && min.data >= root.data) {
            return false;
        }
        if (max != null && max.data <= root.data) {
            return false;
        }

        // now check for left and right subtree

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        boolean isValid = isValidBST(root, null, null);
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }

    }
}
