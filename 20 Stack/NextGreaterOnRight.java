import java.util.Stack;

public class NextGreaterOnRight {

    public static void nextGreaterEle(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // jab tak stack ke top pe curr ele se bada ele nahi ajata tab tak pop karo ,
            // kyoyki hame bade ele chaiye
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nextGreater[i] = -1; // means no ele is greater then curr ele
            } else {
                nextGreater[i] = arr[st.peek()];
            }

            st.push(i); // we are pushing idx not ele
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };

        nextGreaterEle(arr);
        // op:= 8 -1 1 3 -1
    }
}
