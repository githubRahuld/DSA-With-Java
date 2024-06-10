public class OddAfterEven {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node oddAfterEven(Node head) {
        Node even = null;
        Node evenList = null;
        Node odd = null;
        Node oddList = null;

        while (head != null) {
            if (head.data % 2 == 0) {// even num
                if (evenList == null) {
                    even = head;
                    evenList = head;
                } else {
                    evenList.next = head;
                    evenList = evenList.next;
                }
            } else { // odd num
                if (oddList == null) {
                    odd = head;
                    oddList = head;
                } else {
                    oddList.next = head;
                    oddList = oddList.next;
                }
            }
            head = head.next;
        }

        if (evenList != null) { // if evenList exists
            evenList.next = odd; // evenList ke last me odd pointer ko attach krna
        }
        if (oddList != null) { // if odd list exists
            oddList.next = null; // odd list ke end me null ko point karna h
        }

        if (evenList != null) {
            return even;
        }
        return odd;
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
        OddAfterEven ll = new OddAfterEven();
        Node head = new Node(8);
        head.next = new Node(12);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(6);

        ll.printLL(head);

        Node newNode = ll.oddAfterEven(head);
        ll.printLL(newNode);
    }
}
