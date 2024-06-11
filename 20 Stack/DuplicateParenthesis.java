import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean duplicateParenthesis(String s) {
        if (s.length() == 0) {
            return true;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ')') {
                if (st.peek() == '(') {
                    return true;
                } else {
                    while (!st.isEmpty() && st.peek() != '(') {
                        st.pop();
                    }
                    if (!st.isEmpty()) {
                        st.pop(); // pop '('

                    }
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "(((a+b)+(a-b)))";

        System.out.println(duplicateParenthesis(s));
    }
}
