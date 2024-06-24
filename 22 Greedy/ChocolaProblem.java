import java.util.*;

public class ChocolaProblem {

    public static void chochoProblem(Integer verCost[], Integer horiCost[]) {
        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horiCost, Collections.reverseOrder());

        int v = 0, h = 0; // pointers
        int vp = 1, hp = 1; // single piece
        int cost = 0;

        while (v < verCost.length && h < horiCost.length) {
            if (verCost[v] <= horiCost[h]) { // horicontal cut
                cost += (vp * horiCost[h]);
                h++;
                hp++;
            } else {
                // vertical cut
                cost += (hp * verCost[v]);
                v++;
                vp++;
            }
        }

        while (v < verCost.length) {
            cost += hp * verCost[v];
            v++;
            vp++;
        }

        while (h < horiCost.length) {
            cost += vp * horiCost[h];
            h++;
            hp++;
        }

        System.out.println("Total cost = " + cost);

    }

    public static void main(String[] args) {
        Integer verCost[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer horiCost[] = { 4, 1, 2 }; // n-1

        chochoProblem(verCost, horiCost);
        // Total cost = 42
    }
}
