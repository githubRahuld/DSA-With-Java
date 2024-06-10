public class IntersectionPoint {

    public static class Node {
        int data;
        Node next; // refrencing to next node

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static int findLen(Node head) {
        int size = 0;

        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    public static int findIntersectionPoint(Node head1, Node head2) {
        int len1 = findLen(head1);
        int len2 = findLen(head2);
        System.out.println(len1 + " " + len2);

        Node p1 = null; // p1 should always be greater in len
        Node p2 = null;

        int diff = 0;
        if (len1 < len2) {
            diff = len2 - len1;
            p1 = head2;
            p2 = head1;
        } else {
            diff = len1 - len2;
            p1 = head1;
            p2 = head2;
        }

        int count = 0;
        while (count < diff) { // move p1 diff times
            p1 = p1.next;
            count++;

        }

        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1.data;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return -1;

    }

    public void printLL(Node newHead) {
        Node temp = newHead;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head1 = new Node(10);
        Node head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;

        System.out.println(findIntersectionPoint(head1, head2));

    }
}
