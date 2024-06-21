import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CelebrityProblem {

    public static int celebrityProblem(int mat[][]) {
        int n = mat.length;

        ArrayList<Integer> normal = new ArrayList<>(Collections.nCopies(n, 0)); // inialise with 0
        ArrayList<Integer> celebrity = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {

                    normal.set(i, normal.get(i) + 1); // incre by 1 like:- normal[i]++
                    celebrity.set(j, celebrity.get(j) + 1);
                }
            }
        }

        int size = normal.size();
        for (int i = 0; i < size; i++) {
            if (normal.get(i) == 0 && celebrity.get(i) == n - 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int mat[][] = { { 0, 1 }, { 1, 0 } };
        int mat[][] = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };

        System.out.println(celebrityProblem(mat));

    }
}
