public class MultiplyTwoList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int multipleTwoList(Node head1, Node head2) {

        int num1 = 0;
        int num2 = 0;

        while (head1 != null || head2 != null) {
            if (head1 != null) {
                num1 = num1 * 10 + head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                num2 = num2 * 10 + head2.data;
                head2 = head2.next;
            }
        }
        System.out.println(num1);
        System.out.println(num2);
        return num1 * num2;
    }

    public static void main(String[] args) {
        MultiplyTwoList ll = new MultiplyTwoList();

        Node head1 = new Node(3);
        head1.next = new Node(2);
        head1.next.next = new Node(1);

        Node head2 = new Node(1);
        head2.next = new Node(2);

        System.out.println(ll.multipleTwoList(head1, head2));
    }
}
