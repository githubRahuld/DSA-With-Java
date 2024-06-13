public class Reorder {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next; // ! keep this in mind

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // * Reverse LL */
    public Node reverseLL(Node head) {

        Node prev = null;
        Node currPtr = head;
        Node nextPtr;

        while (currPtr != null) {
            nextPtr = currPtr.next;
            currPtr.next = prev;

            prev = currPtr;
            currPtr = nextPtr;
        }

        return prev;

    }

    public Node zicZak(Node head) {
        // find mid
        Node midNode = findMid(head);

        Node newHead = reverseLL(midNode.next);
        midNode.next = null; // break the link

        Node head1 = head;
        Node head2 = newHead;

        while (head2 != null) {
            Node temp1 = head1.next;
            Node temp2 = head2.next;

            head1.next = head2;
            head2.next = temp1;

            head1 = temp1;
            head2 = temp2;

        }

        return head;
    }

    public void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Reorder ll = new Reorder();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        ll.printLL();

        ll.zicZak(head);
        ll.printLL();
    }
}
// 1->2->3->4->5->6->null
// 1->6->2->5->3->4->null