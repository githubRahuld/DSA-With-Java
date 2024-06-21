import java.util.*;

public class PostfixEvalution {

    public static int postfixEvalution(String s) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') { // extract the whole number

                int num = 0;
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;

                st.push(num);
            } else if (s.charAt(i) == ' ') {
                continue;
            } else {
                int val2 = st.peek();
                st.pop();
                int val1 = st.peek();
                st.pop();

                switch (s.charAt(i)) {
                    case '*':
                        st.push(val1 * val2);
                        break;
                    case '/':
                        st.push(val1 / val2);
                        break;
                    case '+':
                        st.push(val1 + val2);
                        break;
                    case '-':
                        st.push(val1 - val2);
                        break;
                    case '^':
                        st.push((int) Math.pow(val1, val2));
                        break;

                    default:
                        System.out.println("Enter correct operator");
                        break;
                }
            }
        }
        if (!st.isEmpty()) {
            return st.peek();
        }
        return -99999;

    }

    public static void main(String[] args) {
        // String s = "2 3 1 * + 9 -";
        String s = "100 200 + 2 / 5 * 7 +";

        System.out.println(postfixEvalution(s));
    }
}
