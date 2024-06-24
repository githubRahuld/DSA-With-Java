import java.util.*;

public class IndianCoins {

    public static int indianCoins(Integer coins[], int amount) {
        // sort in decending order

        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        int countOfCoins = 0;
        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        return countOfCoins;
    }

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };

        int amount = 590;
        int countOfCoins = indianCoins(coins, amount);
        System.out.println("Total min coins used = " + countOfCoins);
    }
}
