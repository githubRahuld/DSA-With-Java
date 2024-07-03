public class FlatternIntoList {
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

    public static void bTreeToSortedLL(Node root) {

        Node curr = root;

        while (curr != null) {
            if (curr.left != null) {

                Node prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                prev.right = curr.right;
                curr.right = curr.left;
            }

            curr = curr.right;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        bTreeToSortedLL(root);

        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
    }

}
