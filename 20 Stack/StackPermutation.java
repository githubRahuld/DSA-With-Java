import java.util.Stack;

public class StackPermutation {

    public static boolean stackPermutation(int inp[], int op[]) {

        Stack<Integer> st = new Stack<>();

        int j = 0;
        for (int i = 0; i < inp.length; i++) {
            st.push(inp[i]);

            while (!st.isEmpty() && st.peek() == op[j]) {
                st.pop();
                j++;
            }

        }

        if (st.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int inp[] = { 1, 2, 3 };// no
        int op[] = { 3, 1, 2 };

        // int inp[] = { 1, 2, 3 };
        // int op[] = { 2, 1, 3 }; // yes

        boolean ans = stackPermutation(inp, op);
        if (ans == true) {
            System.out.println("Yes");
        } else {
            System.out.println("Not Possible");
        }
    }
}
