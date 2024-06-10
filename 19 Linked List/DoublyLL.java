public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add at head
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;

        head = newNode;
    }

    // add at tail
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(size == 0){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;

        tail = newNode;

    }
    
    // remove at head
    public int removeFirst(){
        if(size == 0){
            System.out.println("Dll IS EMPTY!");
            return Integer.MIN_VALUE;
        }

        size --;
        int val = head.data;
        head = head.next;
        if(head.prev != null){
            head.prev = null;
        }

        return val;
    
    }

    // remove from tail
    public int removeLast(){
        if(size == 0){
            System.out.println("DLL is empty!");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            size--;
            head = tail = null;
            return Integer.MIN_VALUE;
        }

        size--;
        int val = tail.data; 
        if(tail.prev != null){
            tail.prev.next = null;
        }
        tail = tail.prev;

        return val;
    }

    //* Reverse DLL */
    public Node reverse(){
        Node prev = null;
        Node curr = head;
        Node nextPtr ;

        while(curr != null){
            nextPtr = curr.next;
            curr.next = prev;
            curr.prev = nextPtr; //! only this change from SLL

            prev =curr;
            curr = nextPtr;
        }
        return prev;
    }

    public void print(Node head) {
        if (size == 0) {
            System.out.println("DLL is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(4);
        dll.addLast(5);

        dll.removeFirst();

        dll.removeLast();

        dll.print(head);

        //* Reverse DLL */
        Node newHead = dll.reverse();
        dll.print(newHead);
    }
}
