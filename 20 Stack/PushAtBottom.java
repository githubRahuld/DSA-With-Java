import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> st, int val) {

        if (st.empty()) {
            st.push(val);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, val);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        pushAtBottom(st, 4);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
