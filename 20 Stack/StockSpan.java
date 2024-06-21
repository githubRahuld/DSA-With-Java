import java.util.Stack;

public class StockSpan {

    public static void stockSpanProblem(int stock[], int span[]) {

        Stack<Integer> st = new Stack<>();

        span[0] = 1;
        st.push(0); // push index in stack

        for (int i = 1; i < stock.length; i++) {
            while (!st.empty() && stock[st.peek()] <= stock[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1; // usse sare chotey hai
            } else {
                int prevHigh = st.peek();
                span[i] = i - prevHigh;
            }

            st.push(i);
        }

    }

    public static void main(String[] args) {
        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stock.length];

        stockSpanProblem(stock, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
// 1 1 1 2 1 5 7
