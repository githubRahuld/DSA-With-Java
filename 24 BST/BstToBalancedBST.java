import java.awt.List;
import java.util.ArrayList;

public class BstToBalancedBST {
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

    public static void preOrder(Node root, ArrayList<Integer> preorder) {
        if (root == null)
            return;

        preOrder(root.left, preorder);
        preorder.add(root.data);
        preOrder(root.right, preorder);
    }

    public static Node balancedBST(ArrayList<Integer> preoder, int st, int end) {
        if (st > end)
            return null;

        int mid = (st + end) / 2;

        Node root = new Node(preoder.get(mid));

        root.left = balancedBST(preoder, st, mid - 1);
        root.right = balancedBST(preoder, mid + 1, end);

        return root;
    }

    public static Node bstToBalancedBST(Node root) {
        // Step 1: store preorder of given bst (it will give sorted array)
        // step 2: create balanced BST from sorted array.

        ArrayList<Integer> preorder = new ArrayList<>();
        preOrder(root, preorder);

        // step 2
        root = balancedBST(preorder, 0, preorder.size() - 1);

        return root;
    }

    public static void printBST(Node root) {
        // preorder

        if (root == null)
            return;

        System.out.print(root.data + " ");
        printBST(root.left);
        printBST(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        printBST(root);
        System.out.println();
        root = bstToBalancedBST(root);
        printBST(root);
    }
}
