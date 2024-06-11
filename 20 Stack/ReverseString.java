import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str) {
        Stack<Character> st = new Stack<>();

        // push all char into Stack
        int itr = 0;
        while (itr < str.length()) {
            st.push(str.charAt(itr));
            itr++;
        }

        // pop out all char one by one from stack and append into StringBuilder
        StringBuilder sb = new StringBuilder("");
        while (!st.isEmpty()) {
            sb.append(st.peek());
            st.pop();
        }

        // Convert StringBuilder to String
        String result = sb.toString();

        return result;
    }

    public static void main(String[] args) {

        String str = "rahul";

        String result = reverseString(str);

        System.out.println(result);
    }
}
