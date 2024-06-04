public class TtillingProblem {

    public static int  tillingProblem(int n) { // 2 X N floor
        if(n == 0 || n==1) return 1;

        int verticalTile = tillingProblem(n-1);
        int horizontalTile = tillingProblem(n-2);

        int totalWays = verticalTile+horizontalTile;

        return totalWays;

    }

    public static void main(String[] args) {
        int n = 4;

        // we have floor or 2 X N size we havae to find total ways to fill with tiles
        // breadth is 2 ,length will be given 

        //we have 2 choices to place tile i.e, vertivally or horizontally
        // if  tile placed in vertical way then it occupy 2x1 space left with n-1
        // if  tile placed in horizontally way then it occupy 2x2 space left with n-2
        // add both the ways to find total ways

        System.out.println(tillingProblem(n));
    }    
}
