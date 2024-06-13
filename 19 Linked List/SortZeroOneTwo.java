public class SortZeroOneTwo {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void sort012(Node head) {

        // create count array of 3 size initalise with 0
        int count[] = { 0, 0, 0 };

        Node temp = head;

        int i = 0;
        // add count of numbers in count array
        while (temp != null) {
            count[temp.data]++;
            temp = temp.next;
        }

        temp = head;
        i = 0;
        while (temp != null) {
            if (count[i] == 0) {
                i++;
            }
            temp.data = i;
            count[i]--;

            temp = temp.next;
        }
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
        SortZeroOneTwo ll = new SortZeroOneTwo();

        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(2);

        ll.printLL(head);
        ll.sort012(head);
        ll.printLL(head);
    }
}
