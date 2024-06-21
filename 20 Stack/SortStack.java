import java.util.Stack;

public class SortStack {

    public static void placeAtCorrectPos(Stack<Integer> st, int x) {

        if (st.isEmpty() || st.peek() < x) {
            st.push(x);
        } else {
            int a = st.peek();
            st.pop();
            placeAtCorrectPos(st, x);
            st.push(a);
        }
    }

    public static void reverseStack(Stack<Integer> st) {

        if (st.isEmpty()) {
            return;
        }

        int x = st.pop();
        reverseStack(st);
        placeAtCorrectPos(st, x);
    }

    public static void sortStack(int arr[]) {

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        reverseStack(st);

        // print stack

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 4, 7, 5 };

        sortStack(arr);

    }
}
