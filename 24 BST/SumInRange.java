public class SumInRange {

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

    static int sum = 0;

    public static void sumInRange(Node root, int k1, int k2) {

        if (root == null)
            return;

        if (k1 <= root.data && k2 >= root.data) {
            sumInRange(root.left, k1, k2);
            sum += root.data;
            sumInRange(root.right, k1, k2);
        } else if (k1 > root.data) {
            sumInRange(root.right, k1, k2);
        } else {
            sumInRange(root.left, k1, k2);
        }

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

        sumInRange(root, 5, 8);
        System.out.println("Sum:" + sum);
    }
}
