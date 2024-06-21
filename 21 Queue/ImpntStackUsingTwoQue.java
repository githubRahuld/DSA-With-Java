import java.util.ArrayDeque;
import java.util.Queue;

public class ImpntStackUsingTwoQue {

    static class Stack {
        static Queue<Integer> q1 = new ArrayDeque<>();
        static Queue<Integer> q2 = new ArrayDeque<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int val) {
            if (!q1.isEmpty()) { // thing to remember
                q1.add(val);
            } else {
                q2.add(val);
            }
        }

        public static int pop() {

            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            int top = -1; // will store deleted ele

            // case 1 : if ele's are in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }

                    q2.add(top);
                }
            } else {
                // case 2 : if ele's are in q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }

                    q1.add(top);
                }
            }

            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            int top = -1; // will store Top ele

            // case 1 : if ele's are in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();

                    q2.add(top);
                }
            } else {
                // case 2 : if ele's are in q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;

        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.peek();
        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
