import java.util.ArrayList;

public class PairSum {

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

    public static void storeInorder(Node root, ArrayList<Node> inorder) {
        if (root == null)
            return;

        storeInorder(root.left, inorder);
        inorder.add(root);
        storeInorder(root.right, inorder);

    }

    static int count = 0;

    public static int countPair(Node root1, Node root2, int x) {
        if (root1 == null && root2 == null)
            return 0;

        ArrayList<Node> inorder1 = new ArrayList<>();
        ArrayList<Node> inorder2 = new ArrayList<>();

        storeInorder(root1, inorder1);
        storeInorder(root2, inorder2);

        int l = 0;
        int r = inorder2.size() - 1;
        while (l <= inorder1.size() - 1 && r >= 0) {
            if (inorder1.get(l).data + inorder2.get(r).data == x) {
                count++;
                System.out.println(inorder1.get(l).data + "," + inorder2.get(r).data);
                l++;
                r--;
            } else if (inorder1.get(l).data + inorder2.get(r).data > x) {
                r--;
            } else {
                l++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Node root1 = new Node(8);
        root1.left = new Node(5);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

        int x = 16;

        int pairs = countPair(root1, root2, x);
        System.out.println("Total pairs: " + pairs);
    }
}
