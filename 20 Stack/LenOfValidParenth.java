import java.util.Stack;

public class LenOfValidParenth {

    public static int lengthValidParenthesis(String s) {

        Stack<Character> st = new Stack<>();
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else {
                if (st.peek() == '(') {
                    len += 2;
                    st.pop();
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "((()((()))";

        int len = lengthValidParenthesis(s);
        System.out.println(len);
    }
}
