import java.util.ArrayList;
import java.util.Collections;

public class BTreeToBST {
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

    public static void storeInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null)
            return;

        storeInorder(root.left, inorder);
        inorder.add(root.data);
        storeInorder(root.right, inorder);
    }

    static int idx = 0;

    public static void buildBST(Node root, ArrayList<Integer> inorder) {

        if (root == null)
            return;

        buildBST(root.left, inorder);
        root.data = inorder.get(idx++);
        buildBST(root.right, inorder);

    }

    public static Node bTreeToBST(Node root) {
        // store
        ArrayList<Integer> inorder = new ArrayList<>();
        storeInorder(root, inorder);

        // sort
        Collections.sort(inorder);

        // fill the tree
        buildBST(root, inorder);

        return root;
    }

    public static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);

        printInorder(root);
        System.out.println();
        root = bTreeToBST(root);

        printInorder(root);

        // Step 1: Calculate inorder and store in List
        // step 2: Sort the list(inorder)
        // step 3 traverse tree again and re-place orginal values by sorted list values
        // (inorder)
    }
}
