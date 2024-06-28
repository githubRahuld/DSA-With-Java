import java.util.ArrayList;

public class LCA {

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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {

        if (root == null) {
            return false;
        }

        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) { // node found in anyone of subtree
            return true;
        }

        path.remove(path.size() - 1); // remove if node is not in path
        return false;

    }

    public static Node lca(Node root, int n1, int n2) {

        if (root == null) {
            return null;
        }

        ArrayList<Node> n1Path = new ArrayList<>();
        ArrayList<Node> n2Path = new ArrayList<>();

        // first find and store path of n1 and n2
        getPath(root, n1, n1Path);
        getPath(root, n2, n2Path);

        // now search for first common ancestor
        Node lca = null;
        for (int i = 0; i < n1Path.size() && i < n2Path.size(); i++) {
            if (n1Path.get(i) != n2Path.get(i)) {
                break;
            }
            lca = n1Path.get(i);
        }

        return lca;
    }

    // recursively :dry run
    public static Node lca2(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = lca2(root.left, n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);

        // leftLCA = val & rightLCA = null
        if (rightLCA == null) {
            return leftLCA;
        }
        // rightLCA = val & leftLCA = null
        if (leftLCA == null) {
            return rightLCA;
        }
        // if both are not null then root is the ancestor
        return root;
    }

    public static void main(String[] args) {
        // lca = first common accestor of both num

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node lca = lca(root, 4, 5);
        System.out.println(lca.data);

        // Recursively :no extra space used
        Node lca2 = lca2(root, 4, 5);
        System.out.println(lca2.data);
    }
}
