import java.util.*;
import java.util.LinkedList;

public class NearestCellOne {

    public static class Node {
        int first;
        int second;
        int third;

        public Node(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    public static void nearestCell1(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        int vis[][] = new int[n][m];
        int dis[][] = new int[n][m]; // ans array

        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    vis[i][j] = 1;
                    q.add(new Node(i, j, 0)); // use this instead of pairs
                } else {
                    vis[i][j] = 0;
                }
            }
        }

        int delRow[] = { -1, 0, +1, 0 };
        int delCol[] = { 0, +1, 0, -1 };

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            int step = q.peek().third;

            q.remove();

            dis[row][col] = step;

            for (int i = 0; i < 4; i++) {

                int nRow = row + delRow[i];
                int nCol = col + delCol[i];

                if ((nRow >= 0 && nRow < n) && (nCol >= 0 && nCol < m) && vis[nRow][nCol] == 0) {
                    q.add(new Node(nRow, nCol, step + 1));
                    vis[nRow][nCol] = 1;
                }
            }
        }

        System.out.println("Distance of nearest cell: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dis[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 0, 0 } };

        nearestCell1(mat);
    }
}
