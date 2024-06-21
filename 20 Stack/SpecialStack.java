import java.util.Stack;

public class SpecialStack {

    public static int min;
    static Stack<Integer> st = new Stack<>();

    public static void push(int x) {
        if (st.isEmpty()) {
            min = x;
            st.push(x);
        } else if (x <= min) {
            // x is smaller then min ele
            int data = 2 * x - min;
            st.push(data);
            min = x;
        } else {
            // x is greater then min ele
            st.push(x);
        }
    }

    public static void pop() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        } else if (st.peek() <= min) {
            int data = 2 * min - st.peek();
            min = data;
            st.pop();
        } else {
            st.pop();
        }

    }

    public static int getMin() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return min;
    }

    public static void main(String[] args) {
        SpecialStack st = new SpecialStack();
        st.push(18);
        st.push(19);
        st.push(29);
        st.push(15);
        st.push(16);

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(getMin());

    }
}