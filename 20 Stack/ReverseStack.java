import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data); // push new ele at bottom
            return;
        }

        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top); // push old ele

    }

    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.peek();
        st.pop();
        reverseStack(st);
        // System.out.println(top);
        pushAtBottom(st, top);
    }

    public static void printStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        reverseStack(st);
        printStack(st);
    }
}

/*
 * Approch:-
 * 1) pop all ele from stack
 * 2) pick top ele and push at buttom using func pushAtBottom
 */
