import java.util.ArrayList;

public class PrintPath {
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

    public static void printList(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void printPath(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;

        // Step 1: add node
        path.add(root.data);

        // step 3: leaf node then print list
        if (root.left == null && root.right == null) {
            printList(path);
        }

        // step 2: traverse in left and right subtree
        printPath(root.left, path);
        printPath(root.right, path);

        // step 4: remove the ele when traversed to it
        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        ArrayList<Integer> path = new ArrayList<>();
        printPath(root, path);
    }

}