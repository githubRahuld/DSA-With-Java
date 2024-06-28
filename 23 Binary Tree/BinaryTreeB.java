import java.util.*;

public class BinaryTreeB {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) { // no node exist means null node
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes); // build leftsub tree
            newNode.right = buildTree(nodes); // build rightsub tree

            return newNode;
        }

        public static void preorder(Node root) {

            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {

            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {

            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {

            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node node = q.remove();

                if (node != null) { // node is not empty
                    System.out.print(node.data + " ");

                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                } else if (!q.isEmpty()) {
                    // que is not empty but level end then add null
                    q.add(null);
                }
            }
        }

        public static int height(Node root) {

            if (root == null) {
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh) + 1;

        }

        public static int countNodes(Node root) {

            if (root == null) {
                return 0;
            }

            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);

            return leftCount + rightCount + 1;

        }

        public static int sumOfNodes(Node root) {

            if (root == null) {
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;

        }

        public static int diameter(Node root) {

            if (root == null) {
                return 0;
            }

            // root is not included in diameter
            int ld = diameter(root.left);
            int rd = diameter(root.right);

            // root is included in diameter
            int lh = diameter(root.left);
            int rh = diameter(root.right);
            int selfDia = lh + rh + 1;

            // max of all three i,e. (selfdia , lh,rh )
            return Math.max(selfDia, Math.max(ld, rd));

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();

        // Build Tree O(n)
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        // Preorder Traversal O(n)
        System.out.println("Pre-order: ");
        tree.preorder(root);

        // Inorder Traversal O(n)
        System.out.println();
        System.out.println("In-order: ");
        tree.inorder(root);

        // Postorder Traversal O(n)
        System.out.println();
        System.out.println("Post-order: ");
        tree.postorder(root);

        // Postorder Traversal O(n)
        System.out.println();
        System.out.println("Level order: ");
        tree.levelOrder(root);

        // Height O(n)
        System.out.println();
        System.out.print("Height of Tree: ");
        System.out.print(tree.height(root));

        // Count of Nodes O(n)
        System.out.println();
        System.out.print("Count of nodes: ");
        System.out.print(tree.countNodes(root));

        // Sum of Nodes O(n)
        System.out.println();
        System.out.print("Sum of nodes: ");
        System.out.print(tree.sumOfNodes(root));

        // Diameter O(n^2)
        System.out.println();
        System.out.print("Diameter: ");
        System.out.print(tree.diameter(root));
    }
}