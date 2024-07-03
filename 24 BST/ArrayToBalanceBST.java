public class ArrayToBalanceBST {
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

    public static Node balancedBST(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }

        // step 1: find mid
        int mid = (st + end) / 2;

        // step 2: create node of mid ele
        Node root = new Node(arr[mid]);

        // step 3: call for left and right subtree
        root.left = balancedBST(arr, st, mid - 1);
        root.right = balancedBST(arr, mid + 1, end);

        return root;
    }

    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
        // given a sorted array ,convert it into balanced BSt
        // balanced BST has minimum height

        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = balancedBST(arr, 0, arr.length - 1);
        preorder(root);
    }
}

// op: 8 5 3 6 11 10 12
