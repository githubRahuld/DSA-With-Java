import java.util.*;;

public class MaxLenChainPair {

    public static int maxLenChainPair(int pair[][]) {

        int chainLen = 0;
        // sort on the basis of end time

        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int lastEnd = pair[0][1]; // last selected pair end
        chainLen++;

        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] >= lastEnd) {
                chainLen++;
                lastEnd = pair[i][1];
            }
        }

        return chainLen;
    }

    public static void main(String[] args) {
        int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        int maxLen = maxLenChainPair(pair);
        System.out.println("max length of chain " + maxLen);
    }
}
