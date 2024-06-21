import java.util.Stack;

public class NearestSmallestRight {

    public static void nextSmallestEle(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int nextSmallest[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // jab tak stack ke top pe curr ele se bada ele nahi ajata tab tak pop karo ,
            // kyoyki hame bade ele chaiye
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nextSmallest[i] = -1; // means no ele is greater then curr ele
            } else {
                nextSmallest[i] = arr[st.peek()];
            }

            st.push(i); // we are pushing idx not ele
        }

        for (int i = 0; i < nextSmallest.length; i++) {
            System.out.print(nextSmallest[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 5, 2, 25 };

        nextSmallestEle(arr);

        // op: 2 5 2 -1 -1
    }
}
