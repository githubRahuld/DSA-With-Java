import java.util.Stack;

public class IsPalindromeLL {

    public static class Node {
        char data;
        Node next; // refrencing to next node

        public Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        Stack<Character> st = new Stack<>();

        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (!st.isEmpty()) {
            if (st.peek() != temp.data) {
                return false;
            }
            st.pop();
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');

        System.out.println(isPalindrome(head));
    }
    // A->B->C->B->A-NULL = palindrome
}
