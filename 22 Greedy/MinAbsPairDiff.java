import java.util.*;

public class MinAbsPairDiff {

    public static int minAbsPairDiff(int A[], int B[]) {
        int sum = 0;

        // diff will bw min when ,we pair ele in manner like both are small or both
        // ele are big
        // chotey ele ko chotey ke sath ,bade ele ko bade ke sath pair krna h

        // sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }

        return sum;

    }

    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 }; // op: 6
        int B[] = { 2, 3, 6, 5 };

        // int A[] = { 1, 2, 3 }; //op: 0
        // int B[] = { 2, 1, 3 };

        // find min absolute diff sum
        int minSum = minAbsPairDiff(A, B);
        System.out.println(minSum);
    }

}