import java.util.ArrayList;

public class ImplmtUsingArrayList {

    public static class Stack {

        ArrayList<Integer> list = new ArrayList<>();

        // Empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int val = list.get(list.size() - 1);
            list.remove(list.size() - 1);

            return val;
        }

        // top
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
