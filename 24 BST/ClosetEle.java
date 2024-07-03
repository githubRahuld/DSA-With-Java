public class ClosetEle {
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

    static int min_diff = 999999;
    static int min_diff_key = -1;

    public static void findClosetELe(Node root, int key) {
        if (root == null)
            return;

        if (root.data == key) {
            min_diff_key = root.data;
            min_diff = 0;
            return;
        }

        if (min_diff > Math.abs(root.data - key)) {
            min_diff = Math.abs(root.data - key);
            min_diff_key = root.data;
        }

        if (key > root.data) {
            findClosetELe(root.right, key);
        } else {
            findClosetELe(root.left, key);
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

        findClosetELe(root, 17);

        System.out.println(min_diff_key);
        System.out.println(min_diff);
    }
}
