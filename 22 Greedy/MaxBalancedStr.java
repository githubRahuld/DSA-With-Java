public class MaxBalancedStr {

    public static void maxBalancedStr(String str) {

        StringBuilder s = new StringBuilder("");
        int countL = 0, countR = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'L') {
                s.append(ch);
                countL++;
            } else {
                s.append(ch);
                countR++;
            }

            if (countL == countR) {
                maxCount++;
                System.out.println(s);
                countL = 0;
                countR = 0;
                s.setLength(0);
            }

        }
        System.out.println("Max balanced string partition: " + maxCount);
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";

        // equal num of L AND R
        // find max str which contain equal num of L and R

        maxBalancedStr(str);
    }
}
