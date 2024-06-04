import java.util.Scanner;

public class FriendsProblem {

    public static int friendsProblem(int n) {
        if(n == 1 || n == 2) return n;

        //single
        int single = friendsProblem(n-1);

        //pair
        int pair = friendsProblem(n-2)*(n-1);

        int totalWays = single+pair;

        return totalWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(friendsProblem(n));
    }    
}
