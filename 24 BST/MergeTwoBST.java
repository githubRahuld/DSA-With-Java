import java.util.ArrayList;

public class MergeTwoBST {

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

    public static void storeInorder(Node root, ArrayList<Integer> list) {

        if (root == null)
            return;
        storeInorder(root.left, list);
        list.add(root.data);
        storeInorder(root.right, list);
    }

    public static ArrayList<Integer> mergeList(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        int i = 0, j = 0;
        int n = list1.size();
        int m = list2.size();
        ArrayList<Integer> finalList = new ArrayList<>();

        while (i < n && j < m) {
            if (list1.get(i) < list2.get(j)) {
                finalList.add(list1.get(i));
                i++;

            } else {
                finalList.add(list2.get(j));
                j++;

            }
        }

        while (i < n) {
            finalList.add(list1.get(i));
            i++;

        }
        while (j < m) {
            finalList.add(list2.get(j));
            j++;

        }
        return finalList;
    }

    public static Node createBalancedBST(ArrayList<Integer> list, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;

        Node root = new Node(list.get(mid));
        root.left = createBalancedBST(list, st, mid - 1);
        root.right = createBalancedBST(list, mid + 1, end);

        return root;
    }

    public static Node mergeTwoBST(Node root1, Node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // step 1:
        storeInorder(root1, list1);
        storeInorder(root2, list2);

        // step 2:
        ArrayList<Integer> list = mergeList(list1, list2);

        // step 3:
        return createBalancedBST(list, 0, list.size() - 1);
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        // step 1: Sort bst1 and bst2 and store in arrayList
        // step 2: merge both list
        // step 3: create balanced bst from list

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeTwoBST(root1, root2);

        inorder(root);
    }
}
