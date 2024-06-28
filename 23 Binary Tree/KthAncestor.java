public class KthAncestor {

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

    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) { // base case
            return -1;
        }

        // first find node
        if (root.data == n) { // node found
            return 0;
        }
        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) { // means node not found
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) { // root dist + 1 == k
            System.out.println(root.data);
        }

        return max + 1; // return dist+1 to it's parent then check again
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 4; // node data
        int k = 2; // kth ancestor

        kthAncestor(root, n, k);
    }
}
