public class MergeKSortedLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Merge Two LL
    public Node mergeTwoList(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        Node result;

        if (list1.data < list2.data) {
            result = list1;
            result.next = mergeTwoList(list1.next, list2);
        } else {
            result = list2;
            result.next = mergeTwoList(list1, list2.next);
        }

        return result;
    }

    public Node mergeKLists(Node arr[], int k) {
        Node head = null;

        for (int i = 0; i < k; i++) {
            head = mergeTwoList(head, arr[i]);
        }

        return head;
    }

    public void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        MergeKSortedLL ll = new MergeKSortedLL();

        int k = 3;
        int n = 4;
        Node arr[] = new Node[k];
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);
        Node head = ll.mergeKLists(arr, k);

        ll.printLL(head);

    }
}
