public class SumTree {

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

    public static int sumTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);

        int data = root.data; // store root data
        // put root ke data me left or right subtree data
        root.data = leftSum + rightSum;

        return data + root.data; // return root + left + right data to its parent
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        sumTree(root);
        preorder(root);
    }
}
