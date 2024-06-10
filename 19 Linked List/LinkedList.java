public class LinkedList {

    public static class Node {
        int data;
        Node next; // refrencing to next node

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addAtHead(int data) {
        Node newNode = new Node(data); // create new Node
        size++;
        if (head == null) { // empty LL
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addATTail(int data) {

        Node newNode = new Node(data);
        
        if (head == null) {
            head = tail = newNode;
            return;
        }
            
        size++;

        tail.next = newNode;
        tail = newNode;
    }

    public void addInMiddle(int pos,int data){
        if(pos == 0){ //0th index
            addAtHead(data);
            return;
        }

        size++;
        Node newNode = new Node(data);

        Node temp = head;

        int count = 0;
        while(count < pos-1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    //* Remove operation 
    public int removeAtHead(){
        if(size == 0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeNode(int pos){
        if(size == 0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }else if(pos == 0){
            removeAtHead();
            return -11111;
        }

        Node temp = head;
        int count = 0;
        while(count<pos-1){
            temp = temp.next;
            count++;
        }

        int val = temp.data;
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        size--;
        return val;
    }

    //* search for key */
    public int search(int key){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if(temp.data == key) return i;
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //* Recursive search */

    public int searchRec(Node head,int idx,int key){
        if(head == null) return -1;

        if(head.data == key){
            return idx;
        }

        return searchRec(head.next,idx+1,key);
    }

    //* Reverse LL */
    public void reverseLL(){
        
        Node prev = null;
        Node currPtr = head;
        Node nextPtr;

        while(currPtr != null){
            nextPtr = currPtr.next;
            currPtr.next = prev;

            prev = currPtr;
            currPtr = nextPtr;
        }

        head = prev;
    }

    //* Check palindrome */

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; //mid ele
    }

    public boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }

        //step 1:- find mid ele
        Node midNode = findMid(head);

        //step 2:- reverse second half of LL
        Node prev = null;
        Node currPtr = midNode;
        Node nextPtr;

        while(currPtr != null){
            nextPtr = currPtr.next;
            currPtr.next = prev;

            prev = currPtr;
            currPtr = nextPtr;
        }
        // compare for palindrome

        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;


    }

    //* detecting cycle
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    //* Removing cycle */
    public void removeCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            if(slow == fast){
                break;
            }

            slow= slow.next;
            fast = fast.next.next;
        }

        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }

        //break the cycle 
        fast.next = null;


    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addAtHead(2);
        // ll.addAtHead(1);
        // ll.print();

        // ll.addATTail(3);
        // ll.addATTail(4);
        // ll.print();

        // ll.addInMiddle(2, 5);
        // ll.print();

        // // ll.removeAtHead();
        // // ll.print();

        // ll.removeNode(4);
        // ll.print();

        // //* Search */
        // int searchValue = ll.search(1);
        // if(searchValue == -1){
        //     System.out.println("Key not found");
        // }else {
        //     System.out.println("key found at index: "+  searchValue);
        // }

        // //* recursive search */
        // System.out.println(ll.searchRec(head,0,5));


        // //* reverse LL */
        // ll.reverseLL();
        // ll.print();

        // //* check palindrome */
        // ll.addAtHead(5);
        // ll.addAtHead(2);
        // ll.addAtHead(1);
    
        ll.print();
        System.out.println(ll.isPalindrome(head));

        //* check cycle */
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        // ll.print(); infinty loop means cycle present
        System.out.println(ll.isCycle());

        //* Remove cycle */
        ll.removeCycle(head);

        System.out.println(ll.isCycle());

        System.out.println("size of LL : "+size);

    }
}
