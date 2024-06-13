public class DeleteGreaterOnRight {

    public static class Node {
        int data;
        Node next;
        Node child;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }

    public static Node reverseLL(Node head) {

        Node prev = null;
        Node curr = head;
        Node nextPtr;

        while (curr != null) {
            nextPtr = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextPtr;
        }

        return prev;
    }

    public void printLL(Node newHead) {
        Node temp = newHead;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node deleteGreaterOnRight(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseLL(head);

        int currMax = newHead.data;

        Node prev = newHead;
        Node curr = prev.next;

        while (prev.next != null) {

            if (curr.data > currMax) {
                currMax = curr.data;
                prev = curr;
            } else {
                prev.next = curr.next;
            }
            curr = curr.next;

        }
        Node nHead = reverseLL(newHead);
        return nHead;
    }

    public static void main(String[] args) {
        DeleteGreaterOnRight ll = new DeleteGreaterOnRight();

        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(3);

        ll.printLL(head);
        Node newNode = ll.deleteGreaterOnRight(head);
        ll.printLL(newNode);
    }
}
