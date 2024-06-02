public class BuySellStocks {

    public static int buySellStocks(int Price[]){

        int maxProfit = 0;
        int buyPrice = Price[0];

        for(int i = 1;i<Price.length;i++){
            int currProfit = Price[i] - buyPrice;

            if(buyPrice > Price[i]){
                buyPrice = Price[i];
            }

            maxProfit = Math.max(currProfit,maxProfit);
        }
        return maxProfit > 0 ? maxProfit : 0;
    }

    public static void main(String[] args) {
        int Price[] = {7,1,5,3,6,4};

       System.out.println( buySellStocks(Price));
    }    
}
