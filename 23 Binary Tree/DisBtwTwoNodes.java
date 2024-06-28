public class DisBtwTwoNodes {

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

    public static Node lca(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (right == null) {
            return left;
        }
        if (left == null) {
            return right;
        }

        // both are not null
        return root;
    }

    public static int dist(Node root, int n, int dis) {
        if (root == null) { // mean n not found
            return -1;
        }

        if (root.data == n) {
            return dis; // find n
        }

        int left = dist(root.left, n, dis + 1);
        if (left != -1) {
            return left;
        }

        return dist(root.right, n, dis + 1);
    }

    public static int disBtwTwoNodes(Node root, int n1, int n2) {
        // Step1 : find LCA of n1 and n2
        // Step2 : then find distance of n1 and n2 from Lca
        // step3 : add dist. of n1 and n2 from lca

        Node lca = lca(root, n1, n2);

        int dis1 = dist(lca, n1, 0);
        int dis2 = dist(lca, n2, 0);

        return dis1 + dis2;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int distance = disBtwTwoNodes(root, 4, 6);
        System.out.println(distance);
    }
}
