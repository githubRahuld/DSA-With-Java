import java.util.*;

public class RottenEggs {

    public static class Pair {
        int row;
        int col;
        int tm;

        public Pair(int row, int col, int tm) {
            this.row = row;
            this.col = col;
            this.tm = tm;
        }
    }

    public static int rottenEggs(int mat[][]) {

        int n = mat.length;
        int m = mat[0].length;

        Queue<Pair> q = new LinkedList<>();

        int vis[][] = new int[n][m];
        int freshCnt = 0; // this count number of fresh Oranges

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    vis[i][j] = 2;
                    q.add(new Pair(i, j, 0));
                } else {
                    vis[i][j] = 0;
                }

                if (mat[i][j] == 1) {
                    freshCnt++;
                }
            }
        }

        int delRow[] = { -1, 0, +1, 0 };
        int delCol[] = { 0, +1, 0, -1 };

        int cn = 0; // this count how many oranges convert from fresh to rotten
        int time = 0;
        while (!q.isEmpty()) {
            int row = q.peek().row;
            int col = q.peek().col;
            int tm = q.peek().tm;

            time = Math.max(tm, time);
            q.remove();

            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];

                if ((nrow >= 0 && nrow < n) && (ncol >= 0 && ncol < m) && vis[nrow][ncol] == 0
                        && mat[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol, tm + 1));
                    vis[nrow][ncol] = 2;

                    cn++;
                }
            }
        }

        if (cn == freshCnt) {
            return time;
        }
        return -1;

    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 1, 2 }, { 0, 1, 2 }, { 2, 1, 1 } };

        System.out.println(rottenEggs(mat));
    }
}
