import java.util.Stack;

public class InfixToPostfix {

    public static int prec(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1; // for opining bracket
    }

    public static StringBuilder infixToPostfix(String s) {

        StringBuilder ans = new StringBuilder("");

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                continue;
            } else if ((ch >= 'A' && ch <= 'Z') || (ch == 'a' && ch <= 'z')) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.peek());
                    st.pop();
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {// bade operator ke uper chota operator nahi aa sakta
                while (!st.isEmpty() && prec(st.peek()) >= prec(ch)) {
                    ans.append(st.peek());
                    st.pop();
                }
                st.push(ch);
            }
        }

        while (!st.empty()) {
            ans.append(st.peek());
            st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "((A + B) - C * (D / E)) + F";

        System.out.println(infixToPostfix(s));
    }
}
