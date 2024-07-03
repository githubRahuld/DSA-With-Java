public class PredecsorSucessor {
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

    public static int pre(Node root, int key) {
        if (root == null)
            return -1;

        while (root.right != null) {
            root = root.right;
        }

        return root.data;

    }

    public static int suc(Node root, int key) {
        if (root == null)
            return -1;

        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    static Node pre;
    static Node suc;

    public static void inorderPreSuc(Node root, int key) {

        if (key == root.data) { // key founded

            // The maximum value in left
            // subtree is predecessor

            if (root.left != null) {
                Node temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }

                pre = temp;
            }

            // The minimum value in
            // right subtree is successor
            if (root.right != null) {
                Node temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }

                suc = temp;
            }

            return; // we found both pre and suc after it return
        } else if (key > root.data) {
            pre = root;
            inorderPreSuc(root.right, key);
        } else {
            suc = root;
            inorderPreSuc(root.left, key);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        // root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        inorderPreSuc(root, 10);

        if (pre == null) {
            System.out.println(-1);
        } else {
            System.out.println(pre.data);
        }

        if (suc == null) {
            System.out.println(-1);
        } else {
            System.out.println(suc.data);
        }
    }
}
