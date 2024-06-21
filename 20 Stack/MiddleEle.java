public class MiddleEle {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node dummyNode = new Node(-1); // thing to remember
    static Node head = dummyNode;
    static Node mid = dummyNode;
    static int count = 0;

    public static void push(int data) {
        Node newNode = new Node(data);

        count++;
        newNode.prev = null;
        newNode.next = head;

        head.prev = newNode;
        head = newNode;

        if (count == 1) {
            mid = head;
        }

        if (count % 2 == 0) {
            mid = mid.prev;
        }
    }

    public static int pop() {
        if (count == 0) {
            System.out.println("stack is empty!");
            return -1;
        }
        count--;

        int popedValue = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }

        if (count % 2 != 0) { // for odd num of ele
            mid = mid.next;
        }
        return popedValue;
    }

    public static void main(String[] args) {
        MiddleEle st = new MiddleEle();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        st.pop();

        System.out.println(mid.data);
    }
}
