import java.util.Stack;

public class ValidParenthesis {

    public static boolean validParenthesis(String s) {
        if (s.length() == 0) {
            return true;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.empty()) {
                    return false;
                } else if (ch == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else if (ch == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        if (!st.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{({[({})]}){}}";

        System.out.println(validParenthesis(s));
    }
}
