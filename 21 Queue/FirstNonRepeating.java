import java.util.*;

public class FirstNonRepeating {

    public static StringBuilder firstNonRepeating(String s) {
        Queue<Character> q = new LinkedList<>();

        int freq[] = new int[26];
        StringBuilder ans = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // step 1 : add in queue
            q.add(ch);

            // step 2: incre ele count in freq array
            freq[ch - 'a']++;

            // step 3: find the non repeating ele
            // jab tak element whoes count is = 1 in freq array not found remove que
            // elements
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                ans.append("-1");
            } else {
                ans.append(q.peek());
            }

            q.add(ch);
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "aabccxb";
        System.out.println(firstNonRepeating(s));
    }
}
// op: a-1bbbbx
