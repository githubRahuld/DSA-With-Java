import java.util.Arrays;

public class LexiSmallString {
    public static void main(String[] args) {
        int N = 3;
        int K = 25;

        char ans[] = new char[N];
        Arrays.fill(ans, 'a');

        for (int i = N - 1; i >= 0; i--) {

            K -= i; // subtract i num of 'a'

            if (K > 0) {
                if (K >= 26) {
                    ans[i] = 'z';
                    K -= 26;
                } else {
                    ans[i] = (char) (97 + K - 1);
                    System.out.println(ans[i]);
                    K -= ans[i] - 'a' + 1;
                }
            } else {
                break;
            }
            K += i;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
