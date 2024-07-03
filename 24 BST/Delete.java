public class Delete {

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

    public static Node findInorderSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        // step 1: search the node
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else { // node founded

            // case 1 : no chilren
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2: only one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // case 3: node to be deleted has both child (left,right)
            Node IS = findInorderSuccesor(root.right); // leftmost node of right subtree

            root.data = IS.data; // replace both values

            root.right = delete(root.right, IS.data); // delete IS
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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

        inorder(root);
        System.out.println();
        Node nRoot = delete(root, 5);
        inorder(nRoot);
    }
}
