public class SwapTwoNodes {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void swapTwoNodes(Node head, int x, int y) {

        if (x == y)
            return;

        Node prevX = null, currX = head;

        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        System.out.println(currX.data + " " + currY.data);

        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY; // prev of x pointed to null
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX; // prev of y pointed to null
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

    }

    public static Node head;

    public void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SwapTwoNodes ll = new SwapTwoNodes();
        head = new Node(7);
        head.next = new Node(6);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);

        ll.printLL(head);

        int x = 5;
        int y = 3;

        // note: - not working for x= 7 and y = 6

        ll.swapTwoNodes(head, x, y);

        ll.printLL(head);
    }
}
