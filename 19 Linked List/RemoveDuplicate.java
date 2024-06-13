import java.util.HashSet;

public class RemoveDuplicate {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeDuplicate(Node head) {
        HashSet<Integer> hs = new HashSet<>();

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (hs.contains(temp.data) == true) {
                prev.next = temp.next;
            } else {
                hs.add(temp.data);
                prev = temp;
            }
            temp = temp.next;

        }
        return head;
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
        RemoveDuplicate ll = new RemoveDuplicate();

        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(10);

        ll.printLL(head);
        Node newHead = ll.removeDuplicate(head);
        ll.printLL(newHead);
    }
    // 10->12->11->11->12->11->10->null
    // 10->12->11->null
}
