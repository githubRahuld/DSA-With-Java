import java.util.Arrays;
import java.util.Comparator;

public class FractionalNapsack {
    public static int fractionalNapsack(int value[], int weight[], int capacity) {
        // step 1: find ratio i,e v/w

        double ratio[][] = new double[value.length][2];
        // 0th col = index, 1th col= ratio
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        // sort
        // sort on the basis of ratio's
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int profit = 0;
        int remCapacity = capacity;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (remCapacity >= weight[idx]) {
                profit += value[idx];
                remCapacity -= weight[idx];
            } else {
                profit += ratio[i][1] * remCapacity;
                remCapacity = 0;
                break;
            }
        }

        return profit;

    }

    public static void main(String[] args) {

        // fraction means :some portion of item can be taken

        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int capacity = 50;

        int ans = fractionalNapsack(value, weight, capacity);
        System.out.println("total profit : " + ans);
    }
}
