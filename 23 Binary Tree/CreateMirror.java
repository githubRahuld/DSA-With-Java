public class CreateMirror {
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

    public static Node createMirrorTree(Node root) {
        if (root == null) {
            return null;
        }

        Node newNode = new Node(root.data);
        newNode.right = createMirrorTree(root.left);
        newNode.left = createMirrorTree(root.right);

        return newNode;
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        inOrder(root);
        System.out.println();
        Node newNode = createMirrorTree(root);
        inOrder(newNode);
    }

    // inorder of two mirror tree is always reverse order
}