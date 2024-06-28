public class IsSubtree {

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

    public static boolean isIdentical(Node node, Node subRoot) {

        if (node == null && subRoot == null) {
            return true;
        }
        // check for the condition when not identical
        else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;

    }

    public static boolean isSubtree(Node root, Node subRoot) {
        // This func find subRoot in Tree
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {

            // check for identicity
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // else check in left and right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    public static void main(String[] args) {

        // Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // SubTree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        // subRoot.right.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}
