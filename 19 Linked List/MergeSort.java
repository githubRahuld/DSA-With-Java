public class MergeSort {

    public static class Node{
        int data ;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next; //! keep this in mind

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node leftList,Node rightList){

        Node mergeList = new Node(-1);
        Node temp = mergeList;

        while(leftList != null && rightList != null){
            if(leftList.data < rightList.data){
                temp.next = leftList;

                leftList = leftList.next;
            }else{
                temp.next = rightList;
                rightList = rightList.next;
            }

            temp = temp.next;
        }

        while(leftList != null){
            temp.next = leftList;
            
            leftList = leftList.next;
            temp = temp.next;
        }

        while(rightList != null){
            temp.next = rightList;

            rightList = rightList.next;
            temp = temp.next;
        }

        return mergeList.next;
    }

    public Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node midNode = findMid(head);

        Node newLeft = head;
        Node newRight = midNode.next;

        midNode.next = null; //break the link 

        Node leftList = mergeSort(newLeft);
        Node rightList = mergeSort(newRight);

        return merge(leftList,rightList);

    }

    public void printLL(Node newHead){
        Node temp = newHead;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

   public static void main(String[] args) {
    MergeSort ll = new MergeSort();

        head = new Node(6);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(43);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next= new Node(7);

        Node newNode = ll.mergeSort(head);
        ll.printLL(newNode);

   } 
}
