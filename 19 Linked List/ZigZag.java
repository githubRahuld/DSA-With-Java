public class ZigZag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void zigZag(Node head) {

        boolean even = false;

        Node temp = head;

        while (temp.next != null) { // temp will not run till temp == null
            if (even == false) { // * for odd place
                if (temp.data > temp.next.data) {
                    int t = temp.data; // don't make t as Node type
                    temp.data = temp.next.data;
                    temp.next.data = t;
                }
                even = !even;
            } else {
                if (temp.data < temp.next.data) { // * for even place
                    int t = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = t;
                }
                even = !even;
            }

            temp = temp.next; // iterator
        }

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

        ZigZag ll = new ZigZag();
        // * zig zag
        // * a<b>c<d>e...
        // * even element should always be greater

        Node head = new Node(11);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(10);

        ll.printLL(head);
        ll.zigZag(head);
        ll.printLL(head);
    }
}
